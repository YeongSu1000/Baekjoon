import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        int t = testCase();
        for (int i = 0; i < t; i++) {
            bw.write(input() + "\n");
        }
        bw.close();
    }

    static int testCase() throws IOException {
        int t = Integer.parseInt(br.readLine());
        return t;
    }

    static int input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a % 10 == 1) return 1;
        if (a % 10 == 0) return 10;
        return lastData(a, b);
    }

    static int lastData(int a, int b) {
        // a의 1의자리수 b번 곱함. 10 넘어갈 때 마다 10 나머지.
        int data = a % 10;
        for (int i = 1; i < b; i++) {
            data *= a;
            data %= 10;
        }
        return data;
    }
}