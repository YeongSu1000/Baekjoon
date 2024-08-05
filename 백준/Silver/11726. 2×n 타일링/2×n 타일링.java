import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.write(arr[n - 1] + "");
        bw.close();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int[] arr;

    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    static void solve() {

        arr = new int[n];
        if(n==1){
            arr[0] = 1;
        }else if(n==2){
            arr[0] = 1;
            arr[1] = 2;
        }else{
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = (arr[i-1]%10007 + arr[i-2]%10007) % 10007;

            }
        }
    }
}