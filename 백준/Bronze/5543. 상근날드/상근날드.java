import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bugger = 2001;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a < bugger) {
                bugger = a;
            }
        }

        int drink = 2001;
        for (int i = 0; i < 2; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a < drink) {
                drink = a;
            }
        }

        bw.write(drink + bugger - 50 + "");
        bw.close();
    }
}