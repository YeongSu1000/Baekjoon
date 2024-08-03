import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            find(i);
        }

        diff++;
        // diff + 1 이 움직임 수 ( 즐겨찾기로 찾았을 때)
        int temp = Math.abs(a - b);

        if (temp > diff) {
            bw.write(diff + "");
        } else bw.write(temp + "");

        bw.close();
    }

    static int[] arr;
    static int diff = 1000;
    static int b;

    static void find(int i) {
        if (Math.abs(arr[i] - b) < diff) {
            diff = Math.abs(arr[i] - b);
        }
    }
}