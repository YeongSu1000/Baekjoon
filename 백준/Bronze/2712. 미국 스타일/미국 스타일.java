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
        String str;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            num = Double.parseDouble(st.nextToken());
            s = st.nextToken();
            change();
            str = String.format("%.4f", num);
            bw.write(str + " " + s + "\n");
        }
        bw.close();
    }

    static double num;
    static String s;

    static void change() {
        switch (s) {
            case "kg":
                num *= 2.2046;
                s = "lb";
                break;
            case "lb":
                num *= 0.4536;
                s = "kg";
                break;
            case "l":
                num *= 0.2642;
                s = "g";
                break;
            case "g":
                num *= 3.7854;
                s = "l";
                break;
        }
    }
}