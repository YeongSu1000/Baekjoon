import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static BigInteger[] a;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());

        a = new BigInteger[n + 2];
        a[0] = new BigInteger("0");
        a[1] = new BigInteger("1");

        test(n);
        bw.write(a[n] + "");
    }

    static void test(int n) {
        for (int i = 2; i <= n; i++) {
            a[i] = a[i-1].add(a[i-2]);
        }
    }
}