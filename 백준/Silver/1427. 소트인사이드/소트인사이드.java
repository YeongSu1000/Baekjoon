import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int i = 0;
        while (n > 0) {
            arr[i] = n % 10;
            n /= 10;
            i++;
        }
        int[] sort = new int[i];

        for (int j = 0; j < i; j++) {
            sort[j] = arr[j];
        }
        Arrays.sort(sort);

        for (int j = i - 1; j >= 0; j--) {
            bw.write(sort[j]+"");
        }

        bw.write("");
        bw.close();
    }
}