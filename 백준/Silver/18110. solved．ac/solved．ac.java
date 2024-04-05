import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] level = new int[n];
        for (int i = 0; i < n; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(level);

        double remove = (double) n *15/100;
        int r = (int) remove;
        if (remove % 1 >= 0.5) {
            r++;
        }
        int sum = 0;

        for (int i = r; i < level.length - r; i++) {
            sum += level[i];
        }
        double avr = (double) sum / (n - r * 2);
        int a = (int)avr;

        if(avr % 1 >= 0.5){
            a++;
        }

        bw.write(a + "");
        bw.close();

    }
}