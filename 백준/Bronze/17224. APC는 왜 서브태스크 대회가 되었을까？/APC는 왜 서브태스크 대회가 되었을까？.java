import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int sub1 = 0;
        int sub2 = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (b <= l) {
                sub2++;
            } else if (a <= l) {
                sub1++;
            }
        }

        while (k > 0) {
            if (sub2 > 0) {
                score += 140;
                sub2--;
            } else if (sub1 > 0) {
                score += 100;
                sub1--;
            } else break;
            k--;
        }
        bw.write(score + "");
        bw.close();
    }
}