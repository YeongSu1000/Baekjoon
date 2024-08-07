import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                arr[index] = i;
                index++;
            }
        }

        int left = 0;
        int right = k - 1;
        int size = index;
        int ans = n + 1;

        while(right < size){
            // right - left + 1
            if(arr[right] - arr[left] + 1 < ans){
                ans = arr[right] - arr[left] + 1;
            }
            left++;
            right++;
        }

        if(ans > n){
            bw.write(-1 + "");
        }else bw.write(ans + "");
        bw.close();
    }
}