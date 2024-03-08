import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int temp = 6;
        int distant = 1;
        int count = 1;
        while(distant < n){
            distant += temp * count;
            count++;
        }
        bw.write(count+ "\n");
        bw.close();
    }
}