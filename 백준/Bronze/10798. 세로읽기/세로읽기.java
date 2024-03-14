import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n = 0;
        int m = 0;

        char[][] matrix = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String word = br.readLine();
            for (int j = 0; j < word.length(); j++) {
                matrix[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[j][i] != '\u0000') {
                    bw.write(matrix[j][i]);
                }
            }
        }

        bw.close();
    }
}