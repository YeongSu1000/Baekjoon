import java.io.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int cardSearch(int a, int card[]) {
        int mid;
        int low = 0;
        int high = card.length - 1;
        int count = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a == card[mid]) {
                count++;
                count += upSearch(card, a, high, mid) - mid;
                count += mid - downSearch(card, a, low, mid);
                return count;

            } else if (a < card[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return count;
    }

    public static int upSearch(int card[], int key, int high, int mid) {
        int low = mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == card[mid]) {
                low = mid + 1;
            } else if (key < card[mid]) {
                high = mid - 1;
            }
        }

        return high;
    }

    public static int downSearch(int card[], int key, int low, int mid) {
        int high = mid;

        while (low <= high) {
            mid = (low + high) / 2;
            
            if (key == card[mid]) {
                high = mid - 1;
            } else if (key > card[mid]) {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1, st2;
        int n = Integer.parseInt(br.readLine());
        int[] sangCard = new int[n];
        st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sangCard[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(sangCard);

        int m = Integer.parseInt(br.readLine());
        int[] mCard = new int[m];
        st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mCard[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < m; i++) {
            bw.write(cardSearch(mCard[i], sangCard) + " ");
        }

        bw.close();

    }
}