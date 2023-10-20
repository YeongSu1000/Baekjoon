import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String str = a.readLine().toUpperCase();

        int[][] temp = new int[26][2];
        // 65 A ~ 90 Z
        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = i + 65;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < temp.length; j++) {
                if ((int) str.charAt(i) - 65 == j) {
                    temp[j][1] += 1;
                }
            }
        }
        int max = 0;
        char maxChar = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i][1] > max) {
                max = temp[i][1];
            }
        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i][1] == max) {
                maxChar = (char)temp[i][0];
                count++;
            }
        }
        if (count == 1) {
            System.out.println(maxChar);
        }else{
            System.out.println("?");
        }

    }
}
