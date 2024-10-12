import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        char alphabet = br.readLine().charAt(0);
        output(alphabet);
    }

    static void output(char alphabet) throws IOException {
        if (alphabet == 'n' || alphabet == 'N') {
            bw.write("Naver D2\n");
        }else bw.write("Naver Whale\n");
    }
}