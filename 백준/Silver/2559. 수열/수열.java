import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        int start = 0;
        int end = k;
        int maxTemp = k * -100 - 1;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i < k) {
                sum += arr[i];
                if (i == k - 1 && sum > maxTemp) {
                    maxTemp = sum;
                }
            } else {
                sum -= arr[start];
                sum += arr[end];
                if (sum > maxTemp) {
                    maxTemp = sum;
                }
                start++;
                end++;
            }
        }
        bw.write(maxTemp+"");
        bw.close();
    }
}