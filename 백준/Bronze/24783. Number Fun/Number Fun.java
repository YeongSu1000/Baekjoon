import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            bw.write(result() + " \n");

        }
        bw.close();
    }

    static int a;
    static int b;
    static int c;

    static String result() {
        if (a + b == c) {
            return "Possible";
        } else if (a + c == b) {
            return "Possible";
        } else if (b + c == a) {
            return "Possible";
        } else if (a * b == c) {
            return "Possible";
        } else if (a * c == b) {
            return "Possible";
        } else if (b * c == a) {
            return "Possible";
        }
        return "Impossible";
    }
}