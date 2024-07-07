import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int aMax = 0;
    public static int aMin = 100;
    public static int bMax = 0;
    public static int bMin = 100;

    // 좌표 입력 받았을 때 (a,b) ~ (a+10 , b+10)까지 색칠
    public static void black(int a, int b, int[][] white) {
        for (int i = a; i < a + 10; i++) {
            for (int j = b; j < b + 10; j++) {
                white[i][j] += 1;
            }
        }
        max(a, b);
        min(a, b);
    }

    public static void max(int a, int b) {
        if (a > aMax) {
            aMax = a;
        }
        if (b > bMax) {
            bMax = b;
        }
    }

    public static void min(int a, int b) {
        if (a < aMin) {
            aMin = a;
        }
        if (b < bMin) {
            bMin = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] white = new int[200][200];
        for (int i = 0; i < white.length; i++) {
            for (int j = 0; j < white[i].length; j++) {
                white[i][j] = 0;
            }
        }


        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) { // 색종이 좌표 함수 num 번 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            black(a, b, white);

        }

        int count = 0;

        for (int i = aMin; i <= aMax + 10; i++) {
            for (int j = bMin; j <= bMax + 10; j++) {
                if (white[i][j] != 0) {
                    count++;
                }
            }
        }
        bw.write(count + "");
        bw.close();

    }
}