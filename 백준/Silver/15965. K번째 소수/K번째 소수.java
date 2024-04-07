import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[8000001];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int t = 2; t < arr.length; t++) {
            for (int i = t + t; i < arr.length; i += t) {
                arr[i] = 0;
            }

        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
            if(count == n){
                bw.write(arr[i]+"");
                break;
            }
        }
        bw.close();
    }
}