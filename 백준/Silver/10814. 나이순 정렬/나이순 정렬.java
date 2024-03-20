import java.io.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] age = new int[n][2];
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            age[i][0] = Integer.parseInt(st.nextToken());
            age[i][1] = i;
            name[i] = st.nextToken();
        }
        Arrays.sort(age, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        for (int i = 0; i < age.length; i++) {
            bw.write(age[i][0]+" " + name[age[i][1]] + "\n");
        }

        bw.close();

    }
}