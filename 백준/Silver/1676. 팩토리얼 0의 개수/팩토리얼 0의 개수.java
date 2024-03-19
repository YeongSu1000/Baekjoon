import java.io.*;

public class Main {
    public static int div5(int n) {
        int a = 0;
        while (n >= 5) {
            if (n % 5 == 0) {
                a++;
            } else return a;
            n /= 5;
        }
        return a;
    }

    public static int div2(int n) {
        int a = 0;
        while (n >= 2) {
            if (n % 2 == 0) {
                a++;
            } else return a;
            n /= 2;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int num2 = 0;
        int num5 = 0;

        for (int i = 1; i <= n; i++) {
            num2 += div2(i);
            num5 += div5(i);
        }

        if(num2 >= num5){
            bw.write(num5+"");
        }else bw.write(num2+"");

        bw.close();

    }
}