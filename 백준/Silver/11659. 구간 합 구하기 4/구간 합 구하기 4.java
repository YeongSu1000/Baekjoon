import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
                arr[i] += arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int start, end;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            int sum = arr[end] - arr[start - 1];

            bw.write(sum + "\n");
        }
        bw.close();
    }
}