import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static String s;

    static void input() throws IOException {
        s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < k; i++) {
            String ringS = br.readLine();
            count += test(ringS);
        }
        bw.write(count + "");
    }

    static int test(String str) {
        String ring = str + str;
        if (ring.contains(s)) {
            return 1;
        }
        return 0;
    }
}