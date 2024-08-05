import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.write(ans + "");
        bw.close();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int width;
    static int height;
    static BigInteger ans = new BigInteger("0");
    static BigInteger q = new BigInteger("10007");

    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    static void solve() {

        width = n / 2;
        height = n % 2;

        while (width >= 0) {
            ans(width, height);
        }
    }

    static void ans(int a, int b) {
        ans = ans.add(factorial(a + b).divide(factorial(a).multiply(factorial(b))));
        ans = ans.mod(q);
        width--;
        height += 2;
    }

    static BigInteger factorial(int n) {
        BigInteger r = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            r = r.multiply(new BigInteger(String.valueOf(i)));
        }
        return r;
    }
}