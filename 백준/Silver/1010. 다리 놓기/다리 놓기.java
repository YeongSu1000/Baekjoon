import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[][] arr;

    static void input() throws IOException {
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr = new int[n + 1][m + 1];
            bw.write(test(n, m) + "\n");
        }
    }

    static int test(int y, int x) {
        if (arr[y][x] != 0) {
            return arr[y][x];
        }

        if (x == y) {
            arr[y][x] = 1;
            return 1;
        } else if (y == 1) {
            arr[y][x] = x;
            return x;
        } else {
            arr[y][x] =  test(y, x - 1) + test(y - 1, x - 1);
        }
        return arr[y][x];
    }
}