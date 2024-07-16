import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int temp = 0;

        int a = s1.charAt(0);
        int b = s2.charAt(0);
        int c = s3.charAt(0);

        if (a > 48 && a < 58) {
            temp = Integer.parseInt(s1);
            temp += 3;
        } else if (b > 48 && b < 58) {
            temp = Integer.parseInt(s2);
            temp += 2;
        } else if (c > 48 && c < 58) {
            temp = Integer.parseInt(s3);
            temp += 1;
        }

        if (temp % 3 == 0 && temp % 5 == 0) {
            bw.write("FizzBuzz" + "\n");
        } else if (temp % 3 == 0 && temp % 5 != 0) {
            bw.write("Fizz" + "\n");
        } else if (temp % 3 != 0 && temp % 5 == 0) {
            bw.write("Buzz" + "\n");
        } else bw.write(temp + "\n");

        bw.close();
    }
}