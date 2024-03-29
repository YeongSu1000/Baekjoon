import java.io.*;

public class Main {

    public static int apart(int k, int n) {
        int people = 0;
        if (k > 0) {
            for (int i = 1; i <= n; i++) {
                people += apart(k - 1, i);
            }

        }

        if (k == 0) {
            return n;
        }
        return people;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int k, n;
        for (int i = 0; i < t; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(apart(k, n) + "\n");
        }
        
        bw.close();

    }
}