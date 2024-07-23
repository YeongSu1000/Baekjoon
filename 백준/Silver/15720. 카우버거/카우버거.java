import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int set = 1001;
        int[] a = new int[Integer.parseInt(st.nextToken())];
        int[] b = new int[Integer.parseInt(st.nextToken())];
        int[] c = new int[Integer.parseInt(st.nextToken())];

        if (a.length < set) {
            set = a.length;
        }
        if (b.length < set) {
            set = b.length;
        }
        if (c.length < set) {
            set = c.length;
        }

        int cost = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            cost += a[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
            cost += b[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c.length; i++) {
            c[i] = Integer.parseInt(st.nextToken());
            cost += c[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        bw.write(cost +"\n");
        for (int i = a.length - 1; i >= a.length - set; i--) {
            cost -= a[i];
            a[i] -= a[i] / 10;
            cost += a[i];
        }

        for (int i = b.length - 1; i >= b.length - set; i--) {
            cost -= b[i];
            b[i] -= b[i] / 10;
            cost += b[i];
        }

        for (int i = c.length - 1; i >= c.length - set; i--) {
            cost -= c[i];
            c[i] -= c[i] / 10;
            cost += c[i];
        }
        bw.write(cost +"\n");
        bw.close();
    }
}