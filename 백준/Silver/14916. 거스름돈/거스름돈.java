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
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 5];
        arr[1] = -1;
        arr[2] = 1;
        arr[3] = -1;
        arr[4] = 2;
        arr[5] = 1;
        for (int i = 6; i <= n; i++) {
            arr[i] = choice(i-2,i-5);
        }
        bw.write(arr[n] + "\n");
    }

    static int choice(int a, int b) {
        if (a == 1 || a == 3) {
            return arr[b] + 1;
        } else if (b == 1 || b == 3) {
            return arr[a] + 1;
        }

        if (arr[a] > arr[b]) {
            return arr[b] + 1;
        } else {
            return arr[a] + 1;
        }
    }
}