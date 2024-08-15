import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] a;
    static int[] b;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());

        a = new int[n + 1];
        b = new int[n + 1];

        a[0] = 1;
        b[0] = 0;

        test(n);
        bw.write(a[n] + " " + b[n]);
    }

    static void test(int n) {
        for (int i = 1; i <= n; i++) {
            a[i] = b[i - 1];
            b[i] = a[i - 1] + b[i - 1];
        }
    }
}