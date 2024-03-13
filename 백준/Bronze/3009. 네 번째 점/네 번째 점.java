import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;
        if (x1 == x2) {
            x = x3;
        } else if (x2 == x3) {
            x = x1;
        } else if (x1 == x3) {
            x = x2;
        }

        if (y1 == y2) {
            y = y3;
        } else if (y2 == y3) {
            y = y1;
        } else if (y1 == y3) {
            y = y2;
        }

        bw.write(x + " ");
        bw.write(y + "\n");
        bw.close();
    }
}