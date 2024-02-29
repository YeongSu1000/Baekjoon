import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 1;
        int a = 0;
        int b = 0;
        StringTokenizer st;
        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("")) {
                break;
            }
            st = new StringTokenizer(line);
            a = Integer.parseInt((st.nextToken()));
            b = Integer.parseInt((st.nextToken()));
            if (a <= 0 || b >= 10) {
                break;
            }
            bw.write(a + b + "\n");
        }
        bw.close();

    }
}
