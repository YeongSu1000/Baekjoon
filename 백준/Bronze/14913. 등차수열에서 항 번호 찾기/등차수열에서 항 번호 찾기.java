import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 첫 항
        int d = Integer.parseInt(st.nextToken()); // 공차
        int k = Integer.parseInt(st.nextToken()); // 찾는 수
        int count = 1;

        if (d > 0) {
            if (k < a) {
                bw.write("X");
            }else if(k==a){
                bw.write(count + "");
            }else {
                while (a < k) {
                    a += d;
                    count++;
                    if (a == k) {
                        bw.write(count + "");
                    } else if (a > k) {
                        bw.write("X");
                    }
                }
            }
        } else {
            if (k > a) {
                bw.write("X");
            }else if(k==a){
                bw.write(count + "");
            } else {
                while (a > k) {
                    a += d;
                    count++;
                    if (a == k) {
                        bw.write(count + "");
                    } else if (a < k) {
                        bw.write("X");
                    }
                }
            }
        }
        bw.close();
    }
}