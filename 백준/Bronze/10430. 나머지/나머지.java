import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int val1 = (a + b) % c;
        int val2 = ((a % c) + (b % c)) % c;
        int val3 = (a * b) % c;
        int val4 = ((a % c) * (b % c)) % c;

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}
