import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int start = 1;
            int end = 50;
            int n = 25;

            int target = Integer.parseInt(br.readLine());
            if (target == 0) {
                break;
            }


            while (target != n) {
                bw.write(n + " ");
                if (n > target) {
                    end = n - 1;
                } else {
                    start = n + 1;
                }

                n = (start + end) / 2;
            }

            bw.write(n + " ");
            bw.write("\n");

        }
        bw.close();
    }
}