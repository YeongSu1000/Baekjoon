import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        BigInteger n = new BigInteger(br.readLine());
        bw.write(test(new BigInteger("0"), n, n) + "");
    }

    static BigInteger test(BigInteger left, BigInteger right, BigInteger n) {
        BigInteger mid = left.add(right).divide(new BigInteger("2"));
        if (mid.multiply(mid).compareTo(n) > 0) {
            right = mid.subtract(new BigInteger("1"));
            return test(left, right, n);
        } else if (mid.multiply(mid).compareTo(n) < 0) {
            left = mid.add(new BigInteger("1"));
            return test(left, right, n);
        } else {
            return mid;
        }
    }
}