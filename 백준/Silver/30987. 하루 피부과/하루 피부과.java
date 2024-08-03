import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();

        bw.write(test() + "");
        bw.close();
    }

    static int x1;
    static int x2;
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        x1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
    }

    static int test() {

        b = b - d;
        c = c - e;

        a = a / 3;
        b = b / 2;

        int a1 = a * (int) Math.pow(x1, 3);
        int b1 = b * (int) Math.pow(x1, 2);
        int c1 = c * x1;
        
        int a2 = a * (int) Math.pow(x2, 3);
        int b2 = b * (int) Math.pow(x2, 2);
        int c2 = c * x2;

        return (a2 + b2 + c2) - (a1 + b1 + c1);
    }
}