import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String text = "SciComLove";
        for (int i = 0; i < n; i++) {
            text = flip(text);
        }
        bw.write(text);
        bw.close();
    }

    static String flip(String text) {
        String a = "SciComLove";
        String b = "evoLmoCicS";

        if(text.equals(a)) {
            return b;
        }else{
            return a;
        }
    }
}