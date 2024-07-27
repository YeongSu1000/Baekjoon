import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int qIndex = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n - i) {
                qIndex = arr[i];
            }else if(qIndex < n - i){
                qIndex = n - i;
            }
        }
        bw.write(qIndex + "");
        bw.close();
    }
}