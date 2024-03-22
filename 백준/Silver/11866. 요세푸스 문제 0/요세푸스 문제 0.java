import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] arrayCopy(int arr[], int k, int size) {
        int[] array = new int[size - 1];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (k + i >= size) {
                array[i] = arr[c];
                c++;
            } else {
                array[i] = arr[k + i];
            }
        }
        return array;
    }

    public static int[] arrayCopy2(int arr[], int k, int size) { // 7 1 2 3 4
        int[] array = new int[size - 1]; // 4
        int c = 0;
        int a = 0;
        int index;
        index = k - array.length - 1; // 10 - 2 - 1
        index--;
        while (index >= arr.length) {
            //index = k % arr.length;
            index -= arr.length;
        }


        for (int i = 0; i < array.length; i++) {  // 4
            if (i == index) { // 0 == 6 - 5 - 1

            }
            if (array.length - index > i) { // 인덱스보다 큰 3 - 2 > i
                array[i] = arr[index + i + 1]; // 0 = 2 + 0 + 1

            } else {
                array[i] = arr[c];
                c++;
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }

        int i = 0;
        bw.write("<");
        while (array.length >= k && array.length != 1) {
            bw.write(array[k - 1] + ", ");
            array = arrayCopy(array, k, array.length);
        }

        int index;
        while (array.length < k && array.length > 1) {
            index = k - array.length - 1;
            while (index >= array.length) {
                index -= array.length;
            }
            //index -= 1; 1 2 3 4 5 - 4

            bw.write(array[index] + ", ");
            array = arrayCopy2(array, k, array.length);
        }
        bw.write(array[0] + ">");


        bw.close();
    }
}