import java.io.*;

public class Main {
    public static int c;

    public static int recursion(String s, int l, int r) {
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else c++; return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        c = 1;
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            bw.write(isPalindrome(s)+" "+c+"\n");
        }

        bw.close();

    }
}