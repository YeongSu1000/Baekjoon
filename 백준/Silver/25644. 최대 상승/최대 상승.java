import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int n;

    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(test(arr) + "");
    }


    static int test(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }

        int min = arr[0];
        int max = arr[0];
        int benefit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                if (benefit < max - min) {
                    benefit = max - min;
                }
                min = arr[i];
                max = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        if (benefit < max - min) {
            benefit = max - min;
        }
        return benefit;
    }
}