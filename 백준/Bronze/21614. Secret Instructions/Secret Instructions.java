import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean rOrL = true; // true L , false R

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        String code = br.readLine();
        while (!code.equals("99999")) {
            test(code);
            code = br.readLine();
        }
    }

    static void test(String code) throws IOException {
        int rl = code.charAt(0) - 48  + code.charAt(1) - 48;
        int a = code.charAt(2) - 48;
        int b = code.charAt(3) - 48;
        int c = code.charAt(4) - 48;

        a *= 100;
        b *= 10;

        int move = a + b + c;

        // true L , false R
        if (rl % 2 != 0) {
            rOrL = true;
        } else if (rl == 0) {

        } else {
            rOrL = false;
        }

        if (rOrL) {
            bw.write("left ");
        } else bw.write("right ");

        bw.write(move + "\n");
    }
}