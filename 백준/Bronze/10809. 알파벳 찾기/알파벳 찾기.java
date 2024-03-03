import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int[] alphabet = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1};
        int alpha;
        for (int i = 0; i < line.length(); i++) { // a 97 ~ 122 z
            alpha = line.charAt(i); // 단어 알파벳
            if(alphabet[alpha - 97]== -1 ){
                alphabet[alpha - 97]=i;
            };
        }
        for (int i = 0; i < alphabet.length; i++) {

            bw.write(alphabet[i] + " ");
        }
        bw.close();

    }
}

