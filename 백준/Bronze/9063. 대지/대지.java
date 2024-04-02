import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x, y;
        int minX = -10001;
        int minY = -10001;
        int maxX = 10001;
        int maxY = 10001;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            if(x > minX) minX = x;
            if(x < maxX) maxX = x;
            y = Integer.parseInt(st.nextToken());
            if(y > minY) minY = y;
            if(y < maxY) maxY = y;
        }

        x = maxX - minX;
        y = maxY - minY;

        bw.write(x*y+"\n");


        bw.close();

    }
}