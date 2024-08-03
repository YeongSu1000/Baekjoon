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
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        // 이분 탐색 left <= right 까지
        // 1. 큰 나무의 절반 = mid
        //   - 각 list[i] 에서 mid 절단 길이 구함 - 메소드 구현
        // 2. m과 대소 비교 - 크거나 작다
        // 3 - 1 클 경우 높여야 함
        // 3 - 2. left = mid + 1
        // 3 - 3. 작을 경우 낮춰야 함
        // 3 - 4. right = mid - 1
        //
        ans = 0;
        left = 0;
        right = list[n - 1];
        while (left <= right) {
            mid = ((long) right + (long) left) / 2;
            long t = cut(mid);

        }
        bw.write(ans + "");
        bw.close();
    }

    static int[] list;
    static int left;
    static int right;
    static long mid;
    static int m;
    static int ans;

    static long cut(long mid) {
        long length = 0;
        // 1. 나무 별 mid로 절단 시 길이 구함
        for (int i = 0; i < list.length; i++) {

            if (list[i] - mid > 0) {
                length += list[i] - mid;
            }
        }
        if (length >= m) {
            ans = (int) mid;
            left = (int) mid + 1;
        } else if(length < m){
            right = (int) mid - 1;
        }
        return length;
    }
}