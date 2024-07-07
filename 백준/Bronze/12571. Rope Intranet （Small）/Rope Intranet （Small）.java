import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        for (int i = 1; i <= test; i++) {
            int t = Integer.parseInt(br.readLine());
            int count = 0;
            int[][] wire = new int[t][2];
            for (int j = 0; j < t; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                wire[j][0] = Integer.parseInt(st.nextToken());
                wire[j][1] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < t; j++) {
                for (int k = 0; k < j; k++) {
                    // ai 보다 크고 bi 보다 작은 경우
                    if (wire[j][0] > wire[k][0] && wire[j][1] < wire[k][1]) {
                        count++;
                    }
                    // ai 보다 작고 bi 보다 큰 경우
                    if (wire[j][0] < wire[k][0] && wire[j][1] > wire[k][1]) {
                        count++;
                    }
                }
            }
            bw.write("Case #" + i + ": " + count + "\n");
        }

        bw.close();
    }
}