import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = 1;
        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int c =0;
        for (int i = 0; i < l; i++) {
            c += (s.charAt(i) - 96) * r;
            r *= 31;
        }
        bw.write(c+"");

        bw.close();

    }
}