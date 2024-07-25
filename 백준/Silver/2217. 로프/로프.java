import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] * (arr.length - i) > max){
                max = arr[i] * (arr.length - i);
            }else if(arr[i] * (arr.length - 1) < max){
                break;
            }
        }

        bw.write(max + "");
        bw.close();
    }
}