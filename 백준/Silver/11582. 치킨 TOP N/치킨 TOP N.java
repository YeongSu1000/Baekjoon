import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());

        int num = n;

        while (num != k) {
            num /= 2;
            for (int i = 0; i < num; i++) {
                Arrays.sort(arr, i * (n / num), i * (n / num) + n / num);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.write("");
        bw.close();
    }
}