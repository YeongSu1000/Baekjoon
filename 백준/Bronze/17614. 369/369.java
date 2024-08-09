import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        bw.write(input() + "");
        bw.close();
    }

    static int input() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += count(i);
        }
        return count;
    }

    static int count(int n) {
        int count = 0;
        int a;
        while (n > 10) {
            a = n % 10;
            if (a == 3 || a == 6 || a == 9) {
                count++;
            }
            n /= 10;
        }
        a = n % 10;
        if (a == 3 || a == 6 || a == 9) {
            count++;
        }
        return count;
    }
}