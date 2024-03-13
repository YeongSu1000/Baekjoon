import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n = 0;
        int m = 0;

        int[][] matrix = new int[9][9];
        int max = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    n = i + 1;
                    m = j + 1;
                }
            }
        }


        bw.write(max + "\n");
        bw.write(n + " " + m);
        bw.close();
    }
}