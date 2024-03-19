import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int triangle(int a, int b, int c, int t) {
        int q = 0;
        int w = 0;
        int z = 0;
        if (a == t) {
            z = t;
            q = b;
            w = c;
        } else if (b == t) {
            z = t;
            q = a;
            w = c;
        } else if (c == t) {
            z = t;
            q = a;
            w = b;
        }
        if (z * z == q * q + w * w) {
            return 1;
        } else return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b, c;
        do {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a+b+c==0){
                break;
            }

            int t = a;
            if (t < b) {
                t = b;
            }
            if (t < c) {
                t = c;
            }

            if (triangle(a, b, c, t) == 1) {
                bw.write("right\n");
            } else bw.write("wrong\n");

        } while ((a + b + c != 0));

        bw.close();

    }
}