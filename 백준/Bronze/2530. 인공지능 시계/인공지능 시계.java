import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        int h = a;
        int m = b;

        if (d >= 3600) {
            h += d / 3600;
            d %= 3600;
        }
        if (d >= 60) {
            m += d / 60;
            d %= 60;
        }
        c += d;
        if (c > 59) {
            c -= 60;
            m++;
        }
        if (m > 59) {
            m -= 60;
            h++;
        }
        if (h > 23) {
            h %= 24;
        }

        bw.write(h + " " + m + " " + c + "");
        bw.close();
    }
}