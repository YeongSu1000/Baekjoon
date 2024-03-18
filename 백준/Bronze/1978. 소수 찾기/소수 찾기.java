import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int primeNumber(int n) {
        int a = 2;
        if (n==1) return 0;
        while (a < n) {
            if (n % a == 0) {
                return 0;
            }
            a++;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int num;
        int count = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());
            count += primeNumber(num);
        }
        bw.write(count + "\n");
        bw.close();

    }
}