import java.io.*;
import java.util.*;

public class Main {
    public static int leap(int day, int month){ // 윤년
        int m = 1;
        int d = 1;
        int count = 1;
        while (m != month || d != day){
            d++;
            count++;
            if(m == 4 || m == 6 || m == 9 || m == 11){ // 30일
                if(d > 30){
                    d = 1;
                    m++;
                }
            }else if(m == 2){ // 29일
                if(d > 29){
                    d = 1;
                    m++;
                }
            }else{ // 31일
                if(d > 31){
                    d = 1;
                    m++;
                }
            }
        }
        return count;
    }

    public static int common(int day, int month){ // 평년
        int m = 1;
        int d = 1;
        int count = 1;
        while (m != month || d != day){
            d++;
            count++;
            if(m == 4 || m == 6 || m == 9 || m == 11){ // 30일
                if(d > 30){
                    d = 1;
                    m++;
                }
            }else if(m == 2){ // 28일
                if(d > 28){
                    d = 1;
                    m++;
                }
            }else{ // 31일
                if(d > 31){
                    d = 1;
                    m++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if (day + month + year == 0) {
                break;
            }

            if (year % 4 == 0) {
                if (year % 400 == 0) { // 윤년
                    bw.write(leap(day,month) + "\n");
                } else if (year % 100 == 0) { // 평년
                    bw.write(common(day,month) + "\n");
                }else{ // 윤년
                    bw.write(leap(day,month) + "\n");
                }
            } else { // 평년
                bw.write(common(day,month) + "\n");
            }
        }
        bw.close();
    }
}