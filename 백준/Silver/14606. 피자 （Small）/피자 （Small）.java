import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] ans;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());

        ans = new int[n + 3];
        ans[1] = 0;
        ans[2] = 1;
        ans[3] = 3;

        test();
        System.out.println(ans[n]);
    }

    static void test() {
        for (int i = 4; i < ans.length; i++) {
            ans[i] = ans[i - 1] + (i-1);
        }
    }
}