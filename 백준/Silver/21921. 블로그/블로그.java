import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int start = 0;
        int end = x;
        int sum = 0;
        int max = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
            if (i == x - 1) {
                sum = arr[i];
                max = arr[i];
                count++;
            } else if (i > x - 1) {
                sum = arr[i] - arr[start];
                start++;
                if (sum > max) {
                    max = sum;
                    count = 1;
                } else if (sum == max) {
                    count++;
                }
            }
        }
        if(max==0){
            bw.write("SAD");
        }else{
            bw.write(max + "\n");
            bw.write(count + "");
        }
        bw.close();
    }
}