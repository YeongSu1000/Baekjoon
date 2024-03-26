import java.io.*;

public class Main {
    public static int[] fibonacciZero(int[] n) {
        int[] arr = new int[n.length];
        if (arr.length == 1) {
            arr[0] = 1;
        } else if (arr.length == 2) {
            arr[0] = 1;
            arr[1] = 0;
        } else if (arr.length == 3) {
            arr[0] = 1;
            arr[1] = 0;
            arr[2] = 1;
        } else{
            arr[0] = 1;
            arr[1] = 0;
            arr[2] = 1;
            arr[3] = 1;
            for (int i = 4; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public static int[] fibonacciOne(int[] n) {
        int[] arr = new int[n.length];
        if (arr.length == 1) {
            arr[0] = 0;
        } else if (arr.length == 2) {
            arr[0] = 0;
            arr[1] = 1;
        } else{
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] zero;
        int[] one;
        for (int i = 0; i < n; i++) {
            int f = Integer.parseInt(br.readLine());
            zero = fibonacciZero(zero = new int[f + 1]);
            one = fibonacciOne(one = new int[f + 1]);
            bw.write(zero[zero.length - 1] + " "+one[one.length - 1]+"\n");
        }


        bw.close();

    }
}