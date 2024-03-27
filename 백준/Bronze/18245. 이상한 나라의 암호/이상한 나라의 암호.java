import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int i = 2;
        while (!s.equals("Was it a cat I saw?")) {

            for (int j = 0; j < s.length(); j += i) {
                bw.write(s.charAt(j) + "");
            }
            bw.write("\n");
            i++;
            s = br.readLine();
        }

        bw.close();
    }
}