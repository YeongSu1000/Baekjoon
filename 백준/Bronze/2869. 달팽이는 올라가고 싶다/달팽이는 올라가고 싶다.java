import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // up
        int b = Integer.parseInt(st.nextToken()); // down
        int v = Integer.parseInt(st.nextToken()); // high

        int upDown = a - b;
        int day;


        if ((v - a) > upDown) {
            day = (v - a) / upDown + 1;
            if ((v - a) % upDown != 0) {
                day += 1;
            }
        } else if (v - a < upDown) {
            day = (v - a) / upDown + 2;
            if(v - a == 0){
                day = 1;
            }
        } else {
            if (v % 2 == 1) {
                v += 1;
            }
            day = v / upDown - 1;
            if (v % upDown != 0) {
                day += 1;
            }

        }
        // 50 47 59


        bw.write(day + "\n");
        bw.close();
    }
}