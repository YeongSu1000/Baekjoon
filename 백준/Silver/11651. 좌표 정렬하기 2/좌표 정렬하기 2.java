import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] point = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(point,((o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }else{
                return Integer.compare(o1[1],o2[1]);
            }
        }));

        for (int i = 0; i < point.length; i++) {
            System.out.println(point[i][0] + " " + point[i][1]);
        }

        bw.write("");
        bw.close();

    }
}