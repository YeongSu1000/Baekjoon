import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        while (count < 100) {
            String line = br.readLine();

            if (line == null || line.equals("")) {
                break;
            }
            bw.write(line + "\n");
            count++;
        }


        bw.close();
    }
}

