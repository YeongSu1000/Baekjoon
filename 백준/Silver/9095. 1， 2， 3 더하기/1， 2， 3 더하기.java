import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] arr = new int[11];
    static int t;

    static void input() throws IOException {
        t = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(test(n)+"\n");
        }
    }

    static int test(int n) {
        if(n <= 3 ){
            return arr[n];
        }
        arr[n] = test(n-1) + test(n-2) + test(n-3);
        return arr[n];
    }
}