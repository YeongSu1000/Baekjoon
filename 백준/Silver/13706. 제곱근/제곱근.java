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
        bw.write(test(n) + "");
    }

    static BigInteger test(BigInteger n) {
        return n.sqrt();
    }
}