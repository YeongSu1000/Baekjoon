import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        arr[0] = 0;
        int start = 0;
        int minLength = 100001;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < arr.length; i++) {
            if (i - start > minLength) {
                start++;
            }
            if (arr[i] - arr[start] >= s && minLength >= i - start) {
                minLength = i - start;
                start++;
                for (int j = start; j < i; j++) {
                    if (arr[i] - arr[j] >= s) {
                        minLength = i - j;
                        start++;
                    } else {
                        break;
                    }
                }
            }
        }
        if(minLength > 100000){
            bw.write("0");
        }else{
            bw.write(minLength + "");
        }
        bw.close();
    }
}