import java.io.*;

public class Main {

    public static int natural(int n) { // 연속된 자연수의 합
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;
                
        if(n==1 || n == 2){
            return 1;
        }
        
        while (start <= n / 2 + 1) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else if (sum == n) {
                count++;
                end++;
                sum += end;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = natural(n);
        bw.write(sum + "");
        bw.close();
    }
}