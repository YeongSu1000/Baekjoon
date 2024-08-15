import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static long[] a;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());

        a = new long[n + 2];
        a[0] = 1;
        a[1] = 1;

        test(n);
        bw.write(a[n - 1] * 2 + a[n] * 2 + "");
    }

    static void test(int n) {
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
    }
}