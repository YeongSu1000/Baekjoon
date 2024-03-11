import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Integer.parseInt(br.readLine());

        Factorial ft = new Factorial();

        long nP = ft.Factorial(n);

        bw.write(nP + "");
        bw.close();
    }
}

class Factorial {
    long Factorial(long a) {
        long b = a;
        if (a > 1) {
            b = a * Factorial(a - 1);
        }
        if (a <= 1) {
            b = 1;
        }
        return b;
    }
}