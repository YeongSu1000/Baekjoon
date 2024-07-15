import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p, s, r;
        int c = 0;
        while (true) {
            c++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            r = p - s;
            if (p == 0 && s == 0) {
                break;
            }

            bw.write("Hole #" + c + "\n");
            if (s == 1) {
                bw.write("Hole-in-one.\n");
            } else if (r == 0) {
                bw.write("Par.\n");
            } else if (r == 1) {
                bw.write("Birdie.\n");
            } else if (r == 2) {
                bw.write("Eagle.\n");
            } else if (r >= 3) {
                bw.write("Double eagle.\n");
            } else if (r == -1) {
                bw.write("Bogey.\n");
            } else if (r <= -2) {
                bw.write("Double Bogey.\n");
            }
            bw.write("\n");

        }

        bw.close();
    }
}