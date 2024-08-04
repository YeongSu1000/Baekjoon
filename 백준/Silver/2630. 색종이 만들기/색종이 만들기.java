import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        color(n,0,0);
        bw.write(countW + "\n" + countB);
        bw.close();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static int[][] arr;
    static int n;
    static int countW = 0;
    static int countB = 0;
    static void test(int size, int x, int y) {
        int half = size / 2;

        for (int i = 0; i < 4; i++) {
            int dx = x + (i % 2) * half; // 0 0 1 1
            int dy = y + (i / 2) * half; // 0 1 0 1
            color(half, dx, dy);
        }
    }

    static void color(int half, int dx, int dy) {
        int a = 0;
        for (int i = dy; i < dy + half; i++) {
            for (int j = dx; j < dx + half; j++) {
                a += arr[j][i];
            }
        }
        if(a == 0){
            countW++;
        }else if (a == half * half){
            countB++;
        }else{
            test(half, dx, dy);
        }
    }
}