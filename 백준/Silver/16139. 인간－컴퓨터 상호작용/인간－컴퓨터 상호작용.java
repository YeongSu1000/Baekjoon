import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // end까지의 리스트 만들어서 a의 누적합 저장
            int[] sum = new int[end + 1];
            if (s.charAt(0) == a) {
                sum[0] = 1;
            } else {
                sum[0] = 0;
            }
            for (int j = 1; j < sum.length; j++) {
                sum[j] = sum[j - 1];
                if (s.charAt(j) == a) {
                    sum[j]++;
                }
            }

            // sum[end] - sum[start - 1] 구하기
            if (start == 0) {
                bw.write(sum[end] + "\n");
            } else {
                bw.write(sum[end] - sum[start - 1] + "\n");
            }
        }
        bw.close();
    }
}