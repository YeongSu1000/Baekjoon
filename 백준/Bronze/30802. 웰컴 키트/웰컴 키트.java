import java.io.*;
import java.util.*;

public class Main {
    public static int shirt(int t, int size) {
        int order = 0;
        order = size / t;
        if (size % t > 0) {
            order++;
        }
        return order;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int xl = Integer.parseInt(st.nextToken());
        int xxl = Integer.parseInt(st.nextToken());
        int xxxl = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int shirtOrder = 0;
        shirtOrder = shirt(t, s) + shirt(t, m) + shirt(t, l) + shirt(t, xl) + shirt(t, xxl) + shirt(t, xxxl);

        int penOrder = 0;
        penOrder += n / p;

        bw.write(shirtOrder + "\n");
        bw.write(penOrder + " " + n % p);
        bw.close();
    }
}