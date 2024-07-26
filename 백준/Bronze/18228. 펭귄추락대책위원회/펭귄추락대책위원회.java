import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean index = false;
        int minR = 1000000001;
        int minL = 1000000001;
        boolean r = false;
        boolean l = false;
        int a;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());
            if (a == -1) {
                index = true;
            } else if (index && a < minR) {
                minR = a;
                r = true;
            } else if (!index && a < minL) {
                minL = a;
                l = true;
            }
        }

        if(!r){
            bw.write(minL + "\n");
        }else if(!l){
            bw.write(minR + "\n");
        }else{
            bw.write(minL + minR + "\n");
        }

        bw.close();
    }
}