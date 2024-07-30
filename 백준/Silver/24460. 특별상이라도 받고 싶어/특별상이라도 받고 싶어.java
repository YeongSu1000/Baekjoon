import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;

    public static int func(int size, int x, int y) {
        if (size < 2) {
            return arr[x][y];
        }

        int half = size / 2;
        int[] arr2 = new int[4];

        for (int i = 0; i < 4; i++) {
            int xx = x + (i % 2) * half;
            int yy = y + (i / 2) * half;

            arr2[i] = func(half, xx, yy);
        }
        Arrays.sort(arr2);
        return arr2[1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(func(n, 0, 0) + "");
        bw.close();
    }
}