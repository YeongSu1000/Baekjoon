import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.write(test(n) + "");
        bw.close();
    }

    // f(n)
    // 2,3으로 안 나누어짐 f(n - 1)
    // 3, 2 나누어짐 f(n / 3), f(n / 2) 비교
    // 3 나누어짐 f(n - 1), f(n / 3) 비교
    // 2 나누어짐 f(n - 1), f(n / 2) 비교
    static int[] arr;
    static int n;

    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[1000001];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;

    }

    static int test(int n) {
        // n 이 1 ~ 4 일 때 까지 재귀.
        if (n <= 4) {
            return arr[n];
        }

        if (n % 3 == 0 && n % 2 == 0) {
            arr[n] = compare(n / 3, n / 2) + 1;
        } else if (n % 3 == 0) {
            arr[n] = compare(n / 3, n - 1) + 1;
        } else if (n % 2 == 0) {
            arr[n] = compare(n / 2, n - 1) + 1;
        } else arr[n] = arr(n - 1) + 1;

        return arr[n];
    }

    static int compare(int a, int b) {
        if (arr[a] == 0 && a > 4) {
            arr[a] = test(a);
        }
        if (arr[b] == 0 && b > 4) {
            arr[b] = test(b);
        }
        if (arr[a] > arr[b]) {
            return arr[b];
        } else return arr[a];
    }

    static int arr(int n) {
        if(arr[n] == 0){
            arr[n] = test(n);
        }
        return arr[n];
    }
}