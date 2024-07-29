import java.io.*;
import java.util.*;

public class Main {
    public static String cantor(String s, int n, String empty) {
        if (s.length() < n) {
            String s1 = s;
            s1 += empty;
            s1 += s;
            empty = empty + empty + empty;
            return cantor(s1, n, empty);
        } else {
            return s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        String empty = " ";
        int n;
        while ((s = br.readLine()) != null) {
            n = (int) Math.pow(3, Double.parseDouble(s));
            s = "-";
            bw.write(cantor(s, n, empty) + "\n");
        }
        bw.close();
    }
}