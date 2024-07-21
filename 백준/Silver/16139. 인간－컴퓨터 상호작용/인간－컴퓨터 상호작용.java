import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[][] arr = new int[26][s.length()];
        int[] arrSize = new int[26];
        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = 0;
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // * 문자열 200,000 문제 200,000

            int index = a - 97;

            if (arrSize[index] == 0) {
                if (s.charAt(0) == a) {
                    arr[index][0] = 1;
                } else {
                    arr[index][0] = 0;
                }
                arrSize[index]++;
            }

            if (arrSize[index] <= end) { // 1 < 5
                for (int j = arrSize[index]; j <= end; j++) { // 1 2 3 4
                    arr[index][j] = arr[index][j - 1];
                    if (s.charAt(j) == a) {
                        arr[index][j]++;
                    }
                    arrSize[index]++;
                }
            }

            if (start == 0) {
                bw.write(arr[index][end] + "\n");
            } else {
                bw.write(arr[index][end] - arr[index][start - 1] + "\n");
            }
        }
        bw.close();
    }
}