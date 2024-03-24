import java.io.*;

public class Main {
    public static int last = 0;

    public static int money(int a, int[] arr) {

        if (a != 0) {
            arr[last] = a;
            last++;
            return a;
        }else{
            last--;
            return -arr[last];
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] money = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            m += money(k,money);
        }
        bw.write(m+" ");

        bw.close();

    }
}