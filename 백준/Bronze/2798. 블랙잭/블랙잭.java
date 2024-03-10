import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] cardNum = new int[n];
        for (int i = 0; i < n; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int cardSum = cardNum[i] + cardNum[j] + cardNum[k];
                    if(cardSum <= m && cardSum > sum){
                        sum = cardSum;
                    }

                }
            }
        }
        bw.write(sum + "");
        bw.close();
    }
}