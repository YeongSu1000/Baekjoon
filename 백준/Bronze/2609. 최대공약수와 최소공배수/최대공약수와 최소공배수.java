import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int max(int m, int n) {
        int a = m;
        int b = n;
        int i = 1;
        int j = 1;
        while (true) {
            if (a > b) {
                b = n * i;
                i++;
            } else if (b > a) {
                a = m * j;
                j++;
            }
            if (a == b) {
                return a;
            }
        }
    }

    public static int min(int a, int b) {
        int i = 2;
        int m = 1;
        while (i <= a || i <= b) {
            if (a % i == 0 && b % i == 0) {
                m *= i;
                a /= i;
                b /= i;
            } else i++;
        }

        return m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(min(a, b) + "\n");
        bw.write(max(a, b) + "\n");

        bw.close();

    }
}