import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Integer.parseInt(br.readLine());
        long count = a*a;

        bw.write(String.valueOf(count) + "\n");
        bw.write(2 + "");
        bw.close();
    }
}