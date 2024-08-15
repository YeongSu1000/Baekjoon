import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] per;

    static void input() throws IOException {
        String name1 = br.readLine();
        String name2 = br.readLine();

        String s = "";

        for (int i = 0; i < name1.length(); i++) {
            s += name1.charAt(i);
            s += name2.charAt(i);
        }
        per = new int[s.length()];
        int size = per.length;
        int[] alphabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        for (int i = 0; i < s.length(); i++) {
            per[i] = alphabet[s.charAt(i) - 65];
        }
        int ans = test(size);
        if(ans < 10){
            bw.write("0");
        }
        bw.write(ans + "");
    }

    static int test(int size) {
        if (size == 2) {
            return per[0] * 10 + per[1];
        }
        for (int i = 0; i < size - 1; i++) {
            per[i] = (per[i] + per[i + 1]) % 10;
        }
        size--;
        return test(size);
    }
}