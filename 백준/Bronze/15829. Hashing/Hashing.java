import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger c = new BigInteger("0");
        BigInteger m = new BigInteger("1234567891");
        BigInteger r = new BigInteger("31");
        for (int i = 0; i < l; i++) {
            BigInteger q = new BigInteger(String.valueOf(s.charAt(i) - 96));
           
            q = q.multiply(r.pow(i)).remainder(m);
            q = q.remainder(m);
            c = c.add(q);
            c = c.remainder(m);
        }

        bw.write(c + "");

        bw.close();

    }
}