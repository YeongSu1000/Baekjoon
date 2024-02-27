import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int c = 1;
        StringTokenizer st;
        while (c != 0) {
            st = new StringTokenizer(br.readLine());
            c = Integer.parseInt((st.nextToken())) + Integer.parseInt((st.nextToken()));
            if (c == 0) {
                break;
            }
            bw.write(c + "\n");
        }
        bw.close();

    }
}
