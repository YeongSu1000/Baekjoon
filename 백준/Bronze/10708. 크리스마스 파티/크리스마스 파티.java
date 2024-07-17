import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = 0;
        }
        StringTokenizer st1 = new StringTokenizer(br.readLine()); // 지목된 타겟
        int target;
        int targetScore;
        for (int i = 0; i < m; i++) {
            target = Integer.parseInt(st1.nextToken());
            StringTokenizer st2 = new StringTokenizer(br.readLine()); // 각자 지목한 번호
            targetScore = 0;
            for (int j = 0; j < n; j++) {
                int c = Integer.parseInt(st2.nextToken());
                if (c == target) {
                    score[j]++;
                } else {
                    targetScore++;
                }
            }
            score[target - 1] += targetScore;
        }

        for (int i = 0; i < score.length; i++) {
            bw.write(score[i] + "\n");
        }

        bw.close();
    }
}