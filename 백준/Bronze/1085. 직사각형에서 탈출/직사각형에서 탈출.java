import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int w1, w2, h1, h2;

        w1 = x;
        w2 = w - x;
        h1 = y;
        h2 = h - y;

        int minDistance = w1;

        if (minDistance >= w2) {
            minDistance = w2;
        } 
        if (minDistance >= h1) {
            minDistance = h1;
        }
        if (minDistance >= h2) {
            minDistance = h2;
        }

        bw.write(minDistance + "");
        bw.close();

    }
}