import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int profit = 0;
        int min = 50;
        int max = 0;
        int[][] maxPrice = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            maxPrice[i][0] = Integer.parseInt(st.nextToken());
            maxPrice[i][1] = Integer.parseInt(st.nextToken());
            if (maxPrice[i][0] > max) {
                max = maxPrice[i][0];
            }
            if (maxPrice[i][0] < min) {
                min = maxPrice[i][0];
            }
        }


        int price = 0;
        int sumPrice;
        int maxProfit = 0;

        for (int i = min; i <= max; i++) {
            sumPrice = 0;
            for (int j = 0; j < maxPrice.length; j++) { // 배열 탐색
                if (maxPrice[j][0] >= i) { // 최대 구매 가격이 같거나 크면
                    if(i-maxPrice[j][1]>0){
                        sumPrice += i - maxPrice[j][1]; // 현재 구매 가격 - 배달 비용
                    }
                }
            }
            if (sumPrice > maxProfit){
                maxProfit = sumPrice;
                price = i;
            }
        }

        bw.write(price + "");
        bw.close();
    }
}