import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int people = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            people -= Integer.parseInt(st.nextToken());
            people += Integer.parseInt(st.nextToken());
            if (people > max) {
                max = people;
            }
        }

        bw.write(max + "\n");
        bw.close();
    }
}