import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int binarySearch(int key, int low, int high, int arr[]) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s1, s2;

        int n = Integer.parseInt(br.readLine());
        int[] integer = new int[n];
        s1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < integer.length; i++) {
            integer[i] = Integer.parseInt(s1.nextToken());
        }
        Arrays.sort(integer);

        int m = Integer.parseInt(br.readLine());
        s2 = new StringTokenizer(br.readLine());
        int search;
        for (int i = 0; i < m; i++) {
            search = Integer.parseInt(s2.nextToken());
            int p = binarySearch(search, 0, integer.length - 1, integer);
                bw.write(p+"\n");
        }

        bw.close();

    }
}