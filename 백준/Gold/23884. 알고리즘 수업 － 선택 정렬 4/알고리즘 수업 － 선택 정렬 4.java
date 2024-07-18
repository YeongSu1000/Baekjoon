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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], i); // key = 리스트 값 , value = 인덱스
        }

        int count = 0;
        int last = size - 1;
        int t = -1;
        while (last > 0) {
            if (map.lastKey() != arr[last]) { // 라스트는 바꿧는데 라스트와 바꾸는 인덱스도 바꿔야 함
                arr[map.get(map.lastKey())] = arr[last]; // 작은거 앞으로 보냄
                // arr[last] 키의 밸류 변경 해야 함
                // value = map.get(map.lastKey())
                map.remove(arr[last]);
                map.put(arr[last],map.get(map.lastKey()));
                arr[last] = map.lastKey(); // 큰거 맨 뒤로 보냄

                count++;
            }
            if (count == k) {
                t = 0;
                break;
            }
            map.remove(map.lastKey());
            last--;

        }
        if (t == -1) {
            bw.write(t + "");
        }else{
            for (int i = 0; i < size; i++) {
                bw.write(arr[i] + " ");
            }
        }
        bw.close();
    }
}