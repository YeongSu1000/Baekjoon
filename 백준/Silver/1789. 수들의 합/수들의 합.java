import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long s = 0;
        long i = 1;
        while (s < n) {
            s += i;
            if (s > n) {
                bw.write(i - 1 + "");
                break;
            } else if (s == n) {
                bw.write(i + "");
                break;
            }
            i++;
        }

        bw.close();
    }
}