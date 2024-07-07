import java.io.*;

public class Main { // 약수들의 합
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int test(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            return 1;
        } else return -1;
    }

    public static void output(int n) throws IOException {
        bw.write(n + " = 1");
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                bw.write(" + " + i);
            }
        }
        bw.write("\n");
    }

    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());

        while (n != -1) {
            if (test(n) == -1) {
                bw.write(n + " is NOT perfect.\n");
            }else output(n);
            n = Integer.parseInt(br.readLine());
        }


        bw.write("\n");

        bw.close();
    }

}