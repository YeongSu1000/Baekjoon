import java.io.*;
import java.util.*;

public class Main {
    static HashMap<Long, Long> map = new HashMap<>();

    public static long infinity(long n, long p, long q) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else if (map.containsKey(n / p) && map.containsKey(n / q)) {
            map.put(n, map.get(n / p) + map.get(n / q));
            return map.get(n);
        } else if (map.containsKey(n / p)) {
            map.put(n, map.get(n / p) + infinity(n / q, p, q));
            return map.get(n);
        } else if (map.containsKey(n / q)) {
            map.put(n, map.get(n / q) + infinity(n / p, p, q));
            return map.get(n);
        }
        else{
            if (n == 0) {
                map.put(n, (long)1);
                return map.get(n);
            } else if (n == 1) {
                map.put(n, (long)2);
                return map.get(n);
            } else {
                return infinity(n / p, p, q) + infinity(n / q, p, q);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long p = Long.parseLong(st.nextToken());
        long q = Long.parseLong(st.nextToken());


        bw.write(infinity(n, p, q) + "");
        bw.close();

    }
}