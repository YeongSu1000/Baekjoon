import java.io.*;
import java.util.*;

public class Main {

    static long c = 0;
    static long a = 1;

    public static void field(int n, int m) {
        if (n % 2 == 1 && m % 2 == 1) {
            n = n / 2 + 1; // 중앙에 소 찍기
            m = m / 2 + 1;
            count();
            // 격자 사각형 생성
            field(n - 1, m - 1);
            
        }
    }
    public static long count() {
        if (c >= 1) {
            a *= 4;
            c += a;
        } else {
            c++;
        }
        return c;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        field(n, m);
        bw.write(c + "");

        bw.write("");

        bw.close();
    }
}