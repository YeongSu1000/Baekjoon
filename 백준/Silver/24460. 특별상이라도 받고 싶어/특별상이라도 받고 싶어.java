import java.io.*;
import java.util.*;

public class Main {
    public static int func(int[][] arr, int size) {
        if (size == 2) {
            int c = 0;
            int[] arr2 = new int[4];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr2[c] = arr[i][j];
                    c++;
                }
            }
            Arrays.sort(arr2);
            return arr2[1];
        } else if (size > 2) {
            int half = size / 2;
            int[][] arr1 = new int[half][half];
            int[][] arr2 = new int[half][half];
            int[][] arr3 = new int[half][half];
            int[][] arr4 = new int[half][half];

            for (int i = 0; i < half; i++) {
                for (int j = 0; j < half; j++) {
                    arr1[i][j] = arr[i][j];
                }
                for (int j = half; j < size; j++) {
                    arr2[i][j - half] = arr[i][j];
                }
            }
            for (int i = half; i < size; i++) {
                for (int j = 0; j < half; j++) {
                    arr3[i - half][j] = arr[i][j];
                }
                for (int j = half; j < size; j++) {
                    arr4[i - half][j - half] = arr[i][j];
                }
            }


            int[] newArr = {func(arr1, half), func(arr2, half), func(arr3, half), func(arr4, half)};
            Arrays.sort(newArr);
            return newArr[1];

        }

        return arr[0][0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(func(arr, n) + "");
        bw.close();
    }
}