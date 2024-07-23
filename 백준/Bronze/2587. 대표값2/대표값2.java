import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        int avr = 0;
        arr[0] = Integer.parseInt(br.readLine());
        avr += arr[0];
        arr[1] = Integer.parseInt(br.readLine());
        avr += arr[1];
        arr[2] = Integer.parseInt(br.readLine());
        avr += arr[2];
        arr[3] = Integer.parseInt(br.readLine());
        avr += arr[3];
        arr[4] = Integer.parseInt(br.readLine());
        avr += arr[4];
        avr /= 5;
        Arrays.sort(arr);
        bw.write(avr + "\n");
        bw.write(arr[2] + "\n");
        bw.close();
    }
}