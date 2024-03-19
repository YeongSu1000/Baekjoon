import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void room(int h, int w, int a) throws IOException {
        int wCount = 1;
        int n = a;
        while (n > h) {
            wCount++; //w
            n -= h; //h
        }
        bw.write(n + "");
        if (wCount < 10) {
            bw.write(0 + "");
        }
        bw.write(wCount + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int h, w, n; // 층 , 방 , 순서
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            
            room(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        bw.close();

    }
}