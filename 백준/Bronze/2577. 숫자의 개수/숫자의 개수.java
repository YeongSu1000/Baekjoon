import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int mul = a * b * c;

        int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (mul > 0) {
            num[mul % 10]++;
            mul /= 10;
        }
        for (int i = 0; i < num.length; i++) {
            bw.write(num[i]+"\n");
        }

        bw.close();

    }
}