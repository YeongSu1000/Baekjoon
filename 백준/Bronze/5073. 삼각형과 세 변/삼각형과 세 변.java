import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int a, b, c;

        while (true) {
            int maxSide = 0;
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a+b+c == 0){
                break;
            }
            if (maxSide <= a) {
                maxSide = a;
            }
            if (maxSide <= b) {
                maxSide = b;
            }
            if (maxSide <= c) {
                maxSide = c;
            }

            int check;
            int t = 0;
            if (maxSide == a) {
                check = b + c;
                if (a < check) {
                    t = 1;
                } else t = 0;
            } else if (maxSide == b) {
                check = a + c;
                if (b < check) {
                    t = 1;
                } else t = 0;
            } else if (maxSide == c) {
                check = a + b;
                if (c < check) {
                    t = 1;
                } else t = 0;
            }

            if (t == 1) {
                if (a == b && b == c) {
                    bw.write("Equilateral\n");
                } else if (a == b || b == c || a == c) {
                    bw.write("Isosceles\n");
                } else bw.write("Scalene\n");
            } else {
                bw.write("Invalid\n");
            }
        }
        bw.close();
    }
}