import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] dp = new int[y + 1];
        dp[0] = n;

        for (int i = 1; i <= y; i++) {
            dp[i] = (int) (dp[i - 1] * 1.05);

            if (i >= 3 && (int)(dp[i - 3] * 1.2) > dp[i]) {
                dp[i] = (int)(dp[i - 3] * 1.2);
            }
            if (i >= 5 && (int)(dp[i - 5] * 1.35) > dp[i]) {
                dp[i] = (int)(dp[i - 5] * 1.35);
            }
        }
        bw.write(dp[y] + "");
    }
}