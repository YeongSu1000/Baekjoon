import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        arr[0] = 0;
        int count = 0;
        int start = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
            if (arr[i] - arr[start] == m) {
                count++;
                start++;
            } else if (arr[i] - arr[start] > m) {
                start++;
                for (int j = start; j <= i; j++) {
                    if(arr[i] - arr[start] > m){
                        start++;
                    }else if(arr[i] - arr[start] == m){
                        count++;
                        start++;
                    }else{
                        break;
                    }
                }
            }
        }
        bw.write(count+"");
        bw.close();
    }
}