import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int start;
        int end;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            if (start == 1) {
                bw.write(arr[end - 1] + "\n");
            } else {
                bw.write(arr[end - 1] - arr[start - 2] + "\n");
            }
        }
        bw.close();
    }
}