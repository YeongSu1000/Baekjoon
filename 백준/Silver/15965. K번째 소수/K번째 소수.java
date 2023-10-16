import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        int[] array = new int[k];
        int arrayCount = 0;
        for (int i = 1; arrayCount < k; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                array[arrayCount] = i;
                count = 0;
                arrayCount++;
            } else {
                count = 0;
            }
        }
        System.out.println(array[k-1]);
    }
}
