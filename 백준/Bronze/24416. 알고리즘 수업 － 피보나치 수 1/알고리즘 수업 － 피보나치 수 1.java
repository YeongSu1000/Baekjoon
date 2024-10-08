import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] arr;
    static int count1 = 0;
    static int count2 = 0;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 2];
        bw.write(fibonacci(n) + " " + count2 + "");
    }

    static int fibonacci(int n) {
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            count2++;
        }
        return arr[n];
    }
}