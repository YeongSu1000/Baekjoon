import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int kD = Integer.parseInt(st.nextToken());
        int kM = Integer.parseInt(st.nextToken());
        int kY = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int d, m, y;

        int newY = 0;
        int newM = 0;
        int newD = 0;

        int king = -1;
        for (int i = 0; i < n; i++) {
            boolean adult = false;
            st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (kY - y > 18) { // 성인
                adult = true;
            } else if (kY - y == 18 && m < kM) { // 성인
                adult = true;
            } else if (kY - y == 18 && m == kM) { // 일 계산
                if (d <= kD) { // 성인
                    adult = true;
                }
            }

            if (adult) {
                if (newY < y) {
                    newY = y;
                    newM = m;
                    newD = d;
                    king = i + 1;
                } else if (newY == y && m > newM) {
                    newM = m;
                    newD = d;
                    king = i + 1;
                } else if (newY == y && m == newM) {
                    if (newD < d) {
                        newD = d;
                        king = i + 1;
                    }
                }
            }

        }
        bw.write(king + "");
        bw.close();
    }
}