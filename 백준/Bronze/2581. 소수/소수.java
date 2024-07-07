import java.io.*;

public class Main { // 소수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine()); // 작은 수
        int n = Integer.parseInt(br.readLine()); // 큰 수

        int[] primeNumber = new int[n + 1];
        for (int i = 0; i < primeNumber.length; i++) {
            primeNumber[i] = i;
        }
        primeNumber[0] = primeNumber[1] = 0;

        for (int i = 2; i < primeNumber.length; i++) {
            if (primeNumber[i] == 0) {
                continue;
            }
            for (int j = i + i; j < primeNumber.length; j += i) {
                primeNumber[j] = 0;
            }
        }
        int sum = 0;
        int min = 10000;
        for (int i = m; i < primeNumber.length; i++) {
            if (primeNumber[i] != 0){
                sum += primeNumber[i];
                if(min > primeNumber[i]){
                    min = primeNumber[i];
                }
            }
        }
        if(sum == 0){
            bw.write("-1");
        }else{
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }
        bw.close();
    }

}