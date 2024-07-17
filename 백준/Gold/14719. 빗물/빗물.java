import java.io.*;
import java.util.*;

public class Main {
    public static int searchSide(int high, int block[], int position) { // 인덱스 높이, , 인덱스
        int left = position - 1;
        int right = position + 1;

        if(left < 0 || right > block.length - 1){ // 각각 사이드 끝인지 확인.
            return 0;
        }

        int leftHigh = high;
        while (left >= 0) {
            if (block[left] > leftHigh) { // 왼쪽이 현재 인덱스 높이보다 높으면
                leftHigh = block[left];
            }
            left--;
        }

        int rightHigh = high;
        while (right < block.length) {
            if (block[right] > rightHigh) {
                rightHigh = block[right];
            }
            right++;
        }

        if (leftHigh == high || rightHigh == high) {
            return 0;
        }

        if (leftHigh > rightHigh) {
            return rightHigh - high;
        } else {
            return leftHigh - high;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h, w;
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] blockHigh = new int[w];
        for (int i = 0; i < w; i++) {
            blockHigh[i] = Integer.parseInt(st.nextToken());
        }
        int water = 0;
        for (int i = 0; i < w; i++) { // 해당 인덱스에 왼쪽과 오른쪽에 각각 가장 높은거 찾기
            water += searchSide(blockHigh[i], blockHigh, i);
        }

        bw.write(water + "");
        bw.close();
    }
}