import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            String p = "";
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    p += String.valueOf(s.charAt(j));
                }
            }
            bw.write(p + "\n");
        }


        bw.close();

    }
}

