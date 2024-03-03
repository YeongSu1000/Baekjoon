import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(line.charAt(i)));
        }
        bw.write( sum + "\n");
        bw.close();

    }
}

