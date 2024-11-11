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
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] sum = new int[s1 + s2 + s3 + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    sum[i + j + k]++;
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] > max) {
                max = sum[i];
                index = i;
            }
        }
        bw.write(index + "\n");
        bw.close();
    }
}