import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Pascal p = new Pascal(n);
        System.out.println(p.temp[k - 1]);
    }
}

class Pascal {
    int[] x = {1};
    int[] temp = {1};
    Pascal(int n) {

        for (int i = 2; i <= n; i++) {
            temp = addSize(temp, i);
        }
    }

    int[] addSize(int[] array, int size) {
        int[] newArray = Arrays.copyOf(array, size);
        newArray[0] = 1;
        newArray[size - 1] = 1;
        if (array.length >= 2) {
            for (int i = 1; i < size - 1; i++) {
                newArray[i] = array[i - 1] + array[i];
            }
        }

        return newArray;
    }
}