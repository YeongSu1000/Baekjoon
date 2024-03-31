import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10000]; // 0 ~ 9999;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())-1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                bw.write(i +1+ "\n");
                arr[i]--;
            }
        }


        bw.close();

    }
}