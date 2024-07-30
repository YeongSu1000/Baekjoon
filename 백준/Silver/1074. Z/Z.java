import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    static int r, c;

    public static int func(int size, int x, int y) {
        if (size == 1) {
            return count;
        } else {
            int half = size / 2;
            int xx = x + half;
            int yy = y + half;



            if (yy > r && xx > c) { // 1 사분면
                return func(half, x, y);
            } else if (yy > r && xx <= c) { // 2 사분면
                count += half * half;
                return func(half, xx, y);
            } else if (yy <= r && xx > c) { // 3 사분면
                count += half * half * 2;
                return func(half, x, yy);
            } else{
                count += half * half * 3;
                return func(half, xx, yy);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = (int) Math.pow(2, Double.parseDouble(st.nextToken()));
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        bw.write(func(n, 0, 0) + "");
        bw.close();
    }
}