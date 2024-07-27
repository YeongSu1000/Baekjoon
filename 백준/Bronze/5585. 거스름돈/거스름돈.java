import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int money = 1000 - n;
        int c = 0;
        while (money > 0) {

            if (money >= 500) {
                money -= 500;
                c++;
            } else if (money >= 100) {
                money -= 100;
                c++;
            } else if (money >= 50) {
                money -= 50;
                c++;
            } else if (money >= 10) {
                money -= 10;
                c++;
            } else if (money >= 5) {
                money -= 5;
                c++;
            } else {
                c += money;
                money = 0;
            }

        }
        bw.write(c + "");
        bw.close();
    }
}