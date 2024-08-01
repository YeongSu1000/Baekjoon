import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }


    public static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            bw.write(hyeobin(Integer.parseInt(br.readLine()), br) + "\n");
        }
        bw.close();
    }

    public static int hyeobin(int n, BufferedReader br) throws IOException {

        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        int arrIndex = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arrIndex = mapAdd(map, st, arr, arrIndex);

        }
        int ans = 1;
        for (int i = 0; i < arrIndex; i++) {
            ans *= map.get(arr[i]) + 1;
        }
        return ans - 1;

    }

    public static int mapAdd(Map<String, Integer> map, StringTokenizer st, String[] arr, int arrIndex) {

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        if (map.containsKey(s2)) {
            map.put(s2, map.get(s2) + 1);
        } else {
            map.put(s2, 1);
            arr[arrIndex] = s2;
            arrIndex++;
        }
        return arrIndex;
    }
}