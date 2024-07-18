import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int last = size - 1;
        int t = -1;
        while (last > 0) {
            int max = 0;
            int index = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            if (max != arr[last]) {
                arr[index] = arr[last];
                arr[last] = max;
                count++;
            }
            if (count == k) {
                bw.write(arr[index] + " " + arr[last]);
                t = 0;
            }
            last--;
        }
        if(t == -1){
            bw.write(t+"");
        }
        bw.close();
    }
}