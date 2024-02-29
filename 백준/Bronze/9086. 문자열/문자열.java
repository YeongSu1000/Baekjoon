import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (n != 0) {
            String line = br.readLine();
            bw.write(line, 0, 1);
            bw.write(line, line.length() - 1, 1);
            bw.write("\n");
            n--;
        }
        bw.close();

    }
}

