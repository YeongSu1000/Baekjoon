import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t;
        String s;
        char[] a = new char[7];
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            for (int j = 0; j < a.length; j++) {
                a[j] = st.nextToken().charAt(0);
            }
            String key = String.valueOf(a[0]);
            key += String.valueOf(a[1]);
            key += String.valueOf(a[2]);
            if (map.containsKey(key)) {
                map.put(key, "?");
            } else map.put(key, s);
        }
        for (int i = 0; i < m; i++) {
            String k = br.readLine().replaceAll(" ","");
            if(map.containsKey(k)){
                bw.write(map.get(k) + "\n");
            }else bw.write("!\n");

        }

        bw.close();

    }
}