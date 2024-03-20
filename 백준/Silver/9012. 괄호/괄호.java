import java.io.*;

public class Main {
    public static String s(String s) {
        int c = 0;
        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
            c += bracket(a[i]);
            if(c==-1){
                return "NO";
            }
        }
        if (c == 0) {
            return "YES";
        } else return "NO";
    }

    public static int bracket(char a) {
        if (a == '(') {
            return 1;
        } else if (a == ')') {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            bw.write(s(s) + "\n");
        }


        bw.close();

    }
}