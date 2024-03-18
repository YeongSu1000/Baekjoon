import java.io.*;

public class Main {
    public static int reverse(int a) {
        int t = 10000;
        int num = 0;
        while (a > 0) { // 27
            num += a % 10 * t; // 274
            t /= 10;
            a /= 10;
        }
        while (num % 10 == 0) {
            num /= 10;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            if (n == reverse(n)) {
                bw.write("yes\n");
            } else bw.write("no\n");

        }

        bw.close();

    }
}