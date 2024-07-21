import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[0][i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + Integer.parseInt(st.nextToken());
            }
        }

        int x1, x2, y1, y2;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            int sum = 0;
            if (x1 == 1) {
                for (int j = y1 - 1; j < y2; j++) {
                    sum += arr[x2 - 1][j];
                }
            } else {
                for (int j = y1 - 1; j < y2; j++) {
                    sum += arr[x2 - 1][j] - arr[x1 - 2][j];
                }
            }

            bw.write(sum + "\n");

        }

        bw.close();
    }
}