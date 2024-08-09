import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(test(n) + "\n");
        }

    }

    static int test(int n) {
        if(n==1){
            return 1;
        }
        return (test(n-1) * 2) + 1;
    }
}