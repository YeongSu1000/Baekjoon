import java.io.*;
import java.util.*;

public class Main {

    public static int find(int[] arr, int n) {
        int right = arr.length - 1;
        int left = 0;
        int mid;

        while (left <= right) {
            mid = (right + left) / 2;
            if (n == arr[mid]) {
                return 1;
            } else if (n > arr[mid]) {
                left = mid + 1;
            } else if (n < arr[mid]) {
                right = mid - 1;
            }

        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        for (int i = 0; i < mArr.length; i++) {
            bw.write(find(nArr,mArr[i]) + " ");
        }


        bw.close();

    }
}