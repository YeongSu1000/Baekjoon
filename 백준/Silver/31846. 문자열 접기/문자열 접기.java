import java.io.*;
import java.util.*;

public class Main {
    public static int score(int l, int r, char[] c) {
        char[] arr = new char[r - l + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = c[l + i - 1];
        }

        return fold(arr);
    }

    public static int fold(char[] arr) {
        int count;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;

            for (int l = i, r = i + 1; l >= 0 && r < arr.length; l--, r++) {
                if(arr[l] == arr[r]){
                    count++;
                }
            }

            if(count > ans){
                ans = count;
            }

        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }

        int q = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int l, r;
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            bw.write(score(l, r, c) + "\n");
        }

        bw.close();
    }
}