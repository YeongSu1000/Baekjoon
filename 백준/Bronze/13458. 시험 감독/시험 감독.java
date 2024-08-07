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

        st = new StringTokenizer(br.readLine());

        int head = Integer.parseInt(st.nextToken());
        int vice = Integer.parseInt(st.nextToken());

        long count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] -= head;
            count++;
            if (arr[i] % vice == 0 && arr[i] > 0) {
                count += arr[i] / vice;
            }else if (arr[i] % vice != 0 && arr[i] > 0){
                count += arr[i] / vice + 1;
            }
        }

        bw.write(count + "");
        bw.close();
    }
}