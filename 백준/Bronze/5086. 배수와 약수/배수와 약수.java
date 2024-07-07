import java.io.*;
import java.util.StringTokenizer;

public class Main { // 배수와 약수

    public static int test(int a, int b) {
        if (a > b) {
            if (a % b == 0) {
                // 배수임
                return 1;
            }
        } else {
            if (b % a == 0) {
                // 약수임
                return 2;
            }
        }
        return 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;
        int t;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0)
                break;

            t = test(a, b);
            switch (t){
                case 1:
                    bw.write("multiple\n");
                    break;
                case 2:
                    bw.write("factor\n");
                    break;
                case 3:
                    bw.write("neither\n");
                    break;
            }

        }

        bw.close();

    }
}