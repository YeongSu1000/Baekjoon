import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] arr;

    static void input() throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            bw.write(test(n, k) + "\n");
        }
    }

    static int test(int n, int k) {
        arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = i + 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                arr[j] = arr[j - 1] + arr[j];
            }
        }
        return arr[k - 1];
    }
}