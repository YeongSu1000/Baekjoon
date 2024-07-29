import java.io.*;

public class Main {

    static int count = 0;

    public static int[] split(int[] arr) {

        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                arr1[i] = arr[i];
            } else {
                arr2[i - arr.length / 2] = arr[i];
            }
        }


        if(arr.length > 2){
            arr1 = split(arr1);
            arr2 = split(arr2);
        }

        if(arr1[0] > arr2[0]){
            count += arr1.length * arr.length;
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = arr2[i];
            }
            for (int i = arr1.length; i < arr.length; i++) {
                arr[i] = arr1[i - arr1.length];
            }
        }else{
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i];
            }
            for (int i = arr2.length; i < arr.length; i++) {
                arr[i] = arr2[i - arr2.length];
            }

        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[(int) Math.pow(2, n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        split(arr);

        bw.write(count + "\n");
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.close();
    }
}