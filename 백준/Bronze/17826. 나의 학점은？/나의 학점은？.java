import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] score = new int[50];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        int hongScore = Integer.parseInt(br.readLine());
        int rank = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == hongScore) {
                rank = i + 1;
                break;
            }
        }

        if(rank <= 5){
            bw.write("A+");
        }else if(rank <= 15){
            bw.write("A0");
        }else if(rank <= 30){
            bw.write("B+");
        }else if(rank <= 35){
            bw.write("B0");
        }else if(rank <= 45){
            bw.write("C+");
        }else if(rank <= 48){
            bw.write("C0");
        }else if(rank <= 50){
            bw.write("F");
        }
        bw.close();
    }
}