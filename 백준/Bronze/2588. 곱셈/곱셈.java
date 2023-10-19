
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;
        int val1 = a * (b % 10);
        b /= 10;
        int val2 = a * (b % 10);
        b /= 10;
        int val3 = a * (b % 10);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(result);

    }
}
