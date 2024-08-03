import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            cow(arr[i][0], arr[i][1], i);
        }

        bw.write(i1 + " " + i2 + "\n");

        bw.close();
    }

    static double distance = 0;
    static int i1;
    static int i2;
    static int[][] arr;

    static void cow(int a, int b, int i) {
        for (int j = i + 1; j < arr.length; j++) {
            double temp = Math.sqrt(Math.pow(a - arr[j][0], 2) + Math.pow(b - arr[j][1], 2));
            if ( temp > distance) {
             distance = temp;
             i1 = i + 1;
             i2 = j + 1;
            }
        }
    }
}