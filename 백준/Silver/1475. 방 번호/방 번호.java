import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        int n = sc.nextInt();

        while (n > 0) {
            num.add(n % 10);
            n /= 10;
        }
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 0) {
                count[0]++;
            } else if (num.get(i) == 1) {
                count[1]++;
            } else if (num.get(i) == 2) {
                count[2]++;
            } else if (num.get(i) == 3) {
                count[3]++;
            } else if (num.get(i) == 4) {
                count[4]++;
            } else if (num.get(i) == 5) {
                count[5]++;
            } else if (num.get(i) == 6 || num.get(i) == 9) {
                count[6]++;
            } else if (num.get(i) == 7) {
                count[7]++;
            } else if (num.get(i) == 8) {
                count[8]++;
            }
        }
        if (count[6] >= 2) {
            if (count[6] % 2 == 0) {
                count[6] /= 2;
            } else {
                count[6] = (count[6] + 1) / 2;
            }
        }

        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        System.out.println(max);
    }
}
