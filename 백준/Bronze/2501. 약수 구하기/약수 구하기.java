import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int divisor(int n, int k) {
        int a = 1;
        int count = 0;
        while (a <= n) {
            if (n % a == 0) {
                count++;
            }
            if(count == k){
                break;
            }
            a++;
        }
        if (count != k) {
            return 0;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        bw.write(divisor(n, k) + "\n");

        bw.close();

    }
}