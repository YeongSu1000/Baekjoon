import java.io.*;
import java.util.*;

public class Main {
    public static int findGood(int key, int arr[], int i) {
        int start = 0;
        int end = arr.length - 1;
        int sum;
        while (start < end) {
            if (start != i && end != i) {
                sum = arr[start] + arr[end];
                if (sum > key) {
                    end--;
                    if (end == i) {
                        end--;
                    }
                } else if (sum < key) {
                    start++;
                    if (start == i) {
                        start++;
                    }
                } else {
                    return 1;
                }
            }
            if (start == i) {
                start++;
            }
            if (end == i) {
                end--;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            count += findGood(num[i], num, i);
        }

        bw.write(count + "");
        bw.close();
    }
}