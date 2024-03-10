import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int exit = 0;
        for (int i = 1; i < n; i++) {
            int sum = i;
            int construct = i;
            while(construct / 10 != 0){
                sum += construct % 10;
                construct /= 10;
            }
                sum += construct;

            if(sum == n){
                bw.write(i + "");
                exit = 1;
                break;
            }
        }
        if(exit == 0){
            bw.write(exit + "");
        }
        bw.close();
    }
}