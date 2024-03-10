import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Factorial ft = new Factorial();

        int nP = ft.Factorial(n);
        int kP = ft.Factorial(k);
        int nMk = ft.Factorial(n - k);


        bw.write(nP / (nMk * kP) + "");
        bw.close();
    }
}

class Factorial {
    int Factorial(int a) {
        int r = 1;
        for (int i = a; i > 0; i--) {
            r *= i;
        }
        return r;
    }
}