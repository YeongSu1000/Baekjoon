import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        float a = Integer.parseInt(st.nextToken());
        float b = Integer.parseInt(st.nextToken());
        float c = Integer.parseInt(st.nextToken());
        float d = Integer.parseInt(st.nextToken());
        float e = Integer.parseInt(st.nextToken());
        float f = Integer.parseInt(st.nextToken());

        int y = -999;
        int x = -999;


        for (int i = -999; i <= 999; i++) {
            if (y != -999 || x != -999) {
                break;
            }
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j - c == 0 && d * i + e * j - f == 0) {
                    y = j;
                    x = i;
                    break;
                }
            }
        }

        bw.write(x + " ");
        bw.write(y + "");


        bw.close();
    }
}