import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int dot = 2;
        for (int i = 0; i < n; i++) {
            dot += dot - 1;
        }
        int saveDot = dot * dot;

        bw.write(saveDot+ "\n");
        bw.close();
    }
}