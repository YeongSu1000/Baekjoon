import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if(arr[i] > max) {
                max = arr[i];
            }
        } 
        
        long count = 0;
        long length = 0;

        long left = 1;
        long right = max;

        while (left <= right) {
            count = 0;
            length = (right + left) / 2;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / length;
            }
            if (count < n) {
                right = length - 1;
            }
            else {
                left = length + 1;
            }

        }

        bw.write(right + "");
        bw.close();
    }
}