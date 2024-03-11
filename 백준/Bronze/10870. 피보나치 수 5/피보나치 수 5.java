import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Fibonacci ft = new Fibonacci();

        int nP = ft.Fibonacci(n);

        bw.write(nP + "");
        bw.close();
    }
}

class Fibonacci {
    int Fibonacci(int a) {
        int b = a;
        if (a > 1) {
            b = Fibonacci(a - 1) + Fibonacci(a - 2);
        }
        if (a == 0) {
            b = 0;
        }
        if (a == 1) {
            b = 1;
        }
        return b;
    }
}