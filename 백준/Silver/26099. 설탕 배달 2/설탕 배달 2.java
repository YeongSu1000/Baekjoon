import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long weight = Long.parseLong(br.readLine());
        long k5 = 0;
        long k3 = 0;

        long w = 0;
        int count = 0;

        w = 5 * (weight / 5);
        k5 = weight / 5;

        while (w >= 0) {

            if ((weight - w) % 3 == 0) {
                k3 = (weight - w) / 3;
                break;
            } else {
                if (w == 0) {
                    break;
                }
                w -= 5;
                k5--;
                if (w < 0) {
                    w = 0;
                    k5 = 0;
                }
            }

        }

        if (k3 + k5 == 0) {
            bw.write("-1");
        } else {
            bw.write(k3 + k5 + "");
        }
        bw.close();
    }
}