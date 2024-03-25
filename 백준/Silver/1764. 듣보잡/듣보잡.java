import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

    public static String noListenNoSee(String[] a, String b) {
        int noNo;
        noNo = Arrays.binarySearch(a, b);
        if (noNo >= 0) {
            return b;
        } else return " ";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] noListen = new String[n];
        String[] noSee = new String[m];

        for (int i = 0; i < n; i++) {
            noListen[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            noSee[i] = br.readLine();
        }
        Arrays.sort(noListen);
        Arrays.sort(noSee);
        String[] noSeeListen;
        int size = 0;
        if (n >= m) {
            noSeeListen = new String[noSee.length];
            for (int i = 0; i < noSee.length; i++) {
                if (!Objects.equals(noListenNoSee(noListen, noSee[i]), " ")) {
                    noSeeListen[size] = noListenNoSee(noListen, noSee[i]);
                    size++;
                }
            }

        } else {
            noSeeListen = new String[noListen.length];
            for (int i = 0; i < noListen.length; i++) {
                if (!Objects.equals(noListenNoSee(noSee, noListen[i]), " ")) {
                    noSeeListen[size] = noListenNoSee(noSee, noListen[i]);
                    size++;
                }
            }
        }
        bw.write(size + "\n");
        for (int i = 0; i < size; i++) {
            bw.write(noSeeListen[i] + "\n");
        }

        bw.close();

    }
}