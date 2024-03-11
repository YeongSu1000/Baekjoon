import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int k1 = 5;
        int k2 = 3;


        int bag = -1;

        for (int i = 0; i <= n / 5; i++) {
            for (int j = 0; j <= n / 3; j++) {
                if (k1 * i + k2 * j == n) {
                    bag = i + j;
                }
            }
        }


        bw.write(bag + "");
        bw.close();
    }
}