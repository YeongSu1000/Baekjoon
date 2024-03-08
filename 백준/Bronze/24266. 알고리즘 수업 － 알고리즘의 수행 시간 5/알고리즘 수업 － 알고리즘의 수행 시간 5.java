import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Integer.parseInt(br.readLine());

        long count = a*a*a;


        bw.write(count + "\n");
        bw.write(3 + "");
        bw.close();
    }
}