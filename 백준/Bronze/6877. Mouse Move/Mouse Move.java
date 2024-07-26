import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int xSum = 0;
        int ySum = 0;
        int x, y;
        while (true) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            xSum += x;
            ySum += y;
            if (x == 0 && y == 0) {
                break;
            }
            if(xSum < 0){
                xSum = 0;
            }
            if(ySum < 0){
                ySum = 0;
            }
            if(xSum > c){
                xSum = c;
            }
            if(ySum > r){
                ySum = r;
            }

            bw.write(xSum + " " + ySum + "\n");

        }


        bw.close();
    }
}