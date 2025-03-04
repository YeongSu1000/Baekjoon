import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int ur, tr, uo, to;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ur = Integer.parseInt(st.nextToken()) * 56;
        tr = Integer.parseInt(st.nextToken()) * 24;
        uo = Integer.parseInt(st.nextToken()) * 14;
        to = Integer.parseInt(st.nextToken()) * 6;

        int r = ur + tr + uo + to;

        bw.write(r+"");
        bw.close();
    }
}