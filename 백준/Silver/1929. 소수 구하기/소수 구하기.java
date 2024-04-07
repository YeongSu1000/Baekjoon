import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int t = 2; t < n; t++) {
            for (int i = t + t; i <= n; i += t) {
                arr[i] = 0;
            }

        }

        for (int i = m; i <= n; i++) {
            if (arr[i] != 0) {
                bw.write(arr[i]+"\n");
            }
        }
        bw.close();

    }
}