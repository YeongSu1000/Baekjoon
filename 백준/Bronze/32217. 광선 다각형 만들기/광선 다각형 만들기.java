import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int n;
        int r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += Integer.parseInt(st.nextToken()) * 2;
        }
        r = 180 * (n - 1) - s;

        bw.write(r + "");
        bw.close();
    }
}