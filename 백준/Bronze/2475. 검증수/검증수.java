import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] n = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(st.nextToken());
            sum += n[i] * n[i];
        }
        sum %= 10;
        bw.write(sum+"");


        bw.close();

    }
}