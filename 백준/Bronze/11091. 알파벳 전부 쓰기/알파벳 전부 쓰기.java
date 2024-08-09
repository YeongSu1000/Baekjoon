import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            String s = br.readLine();
            bw.write(test(s)+"\n");
        }

    }

    static boolean[] alphabet;

    static String test(String s) {
        // s가 팬그램인지 아닌지.
        alphabet = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            // 들어가면 배열 true
            int c = s.charAt(i);
            charSearch(c);
        }


        if (booleanSearch() == 1) {
            return "pangram";
        } else {

            return "missing " + noUse();
        }

    }

    static void charSearch(int c) {
        if (c >= 65 && c <= 90) {
            // 대문자
            alphabet[c - 65] = true;
        } else if (c >= 97 && c <= 122) {
            // 소문자
            alphabet[c - 97] = true;
        }
    }

    static int booleanSearch() {
        for (int i = 0; i < 25; i++) {
            if (!alphabet[i]) {
                return 0;
            }
        }
        return 1;
    }

    static String noUse() {
        String s = "";
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                char c = (char) (i + 97);
                s += c;
            }
        }
        return s;
    }
}