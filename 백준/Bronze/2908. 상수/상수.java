import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        FlipNumber f = new FlipNumber();
        int a2 = f.FlipNumber(a);
        int b2 = f.FlipNumber(b);

        if (a2 > b2) {
            bw.write(a2 + "\n");
        } else {
            bw.write(b2 + "\n");
        }

        bw.close();
    }
}

class FlipNumber {
    int FlipNumber(int n) {
        int a = n / 100;
        n = n - a * 100;
        int b = n / 10;
        n = n - b * 10;
        int c = n / 1 * 100;
        b = b * 10;
        return c + b + a;
    }
}
