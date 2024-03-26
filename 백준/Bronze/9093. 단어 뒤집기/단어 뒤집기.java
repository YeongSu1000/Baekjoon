import java.io.*;
import java.util.*;

public class Main {
    public static String word(String s){
        char[] w = new char[s.length()];
        int j = 0;
        String r = "";
        for (int i = s.length() - 1; i>= 0; i--) {
            w[j] = s.charAt(i);
            r += w[j] ;
            j++;
        }
        return r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                bw.write(word(s)+" ");
            }
            bw.write("\n");
        }
        bw.close();

    }
}