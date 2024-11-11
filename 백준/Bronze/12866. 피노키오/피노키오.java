import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();

        s = s.replace("A", "");
        int aNum = l - s.length();
        l = s.length();

        s = s.replace("C", "");
        int cNum = l - s.length();
        l = s.length();

        long sum1 = ((long)aNum * cNum) % 1000000007;

        s = s.replace("G", "");
        int gNum = l - s.length();
        l = s.length();

        int tNum = l;

        long sum2 = ((long)gNum * tNum) % 1000000007;
        long sum = (sum1 * sum2) % 1000000007;

        bw.write(sum + "");
        bw.close();
    }
}