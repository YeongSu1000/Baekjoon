import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        while (num != 0) {
            test(num);
            num = Integer.parseInt(br.readLine());
        }
    }

    static void test(int num) throws IOException {
        if(num % n == 0){
            bw.write(num + " is a multiple of " + n + ".\n");
        }else bw.write(num + " is NOT a multiple of " + n + ".\n");
    }
}