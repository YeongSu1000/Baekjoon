import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[]num = new long[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Fibonacci f = new Fibonacci(n);
            num[i] = f.num;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(num[i]);
        }

    }
}

class Fibonacci {
    Scanner sc = new Scanner(System.in);
    long[] n = new long[68];
    long num;
    Fibonacci(int n) {
        N();
        num = this.n[n];
    }

    void N() {
        this.n[0] = 1;
        this.n[1] = 1;
        this.n[2] = 2;
        this.n[3] = 4;
        for (int i = 4; i < 68; i++) {
            this.n[i] = this.n[i - 1] + this.n[i - 2] + this.n[i - 3] + this.n[i - 4];
        }
    }
}
