import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 시작 a
        int b = Integer.parseInt(st.nextToken()); // 도착 b
        int n = Integer.parseInt(st.nextToken()); // n대의 비행기
        int minCoast = 1001;

        for (int i = 0; i < n; i++) {
            boolean start = false;
            boolean end = false;
            
            st = new StringTokenizer(br.readLine());
            int coast = Integer.parseInt(st.nextToken());
            int cityNum = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < cityNum; j++) {
                int city = Integer.parseInt(st.nextToken());
                if (city == a && !end) {
                    start = true;
                }

                if (city == b) {
                    if (start) {
                        end = true;
                    }
                    break;
                }
            }

            if(start && end){
                if(coast < minCoast){
                    minCoast = coast;
                }
            }

        }

        if(minCoast > 1000){
            bw.write("-1");
        }else{
            bw.write(minCoast + "");
        }

        bw.close();
    }
}