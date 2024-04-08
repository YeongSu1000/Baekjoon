import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) { // 친구 이름 , (준애, 받은애) 이름
        int[][] f = new int[friends.length][friends.length];
        int[][] giftIndex = new int[friends.length][3]; // 준, 받은, 지수
        int[] fg = new int[friends.length]; // 받을 선물 갯수 저장
        for (int i = 0; i < friends.length; i++) {
            fg[i] = 0;
            giftIndex[i][0] = 0;
            giftIndex[i][1] = 0;
            giftIndex[i][2] = 0;
            for (int j = 0; j < friends.length; j++) {
                f[i][j] = 0;
            }
        }

        for (int i = 0; i < gifts.length; i++) {
            StringTokenizer st = new StringTokenizer(gifts[i]);
            String give = st.nextToken();
            String receive = st.nextToken();
            for (int j = 0; j < friends.length; j++) {
                if (friends[j].equals(give)) {
                    for (int k = 0; k < friends.length; k++) {
                        if (friends[k].equals(receive)) {
                            f[j][k]++;
                            giftIndex[j][0]++;
                            giftIndex[j][2]++;
                            giftIndex[k][1]++;
                            giftIndex[k][2]--;
                        }
                    }
                }
            }
        }
        
        /*for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length; j++) {
                System.out.println(f[i][j]);
            }
        }*/
        
        // 받은놈. 가장 많이 준놈 추가
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length; j++) { // 주고받은 기록 찾기
                if (i != j && (f[i][j] > 0 || f[j][i] < 0) ) { // 주고받은 기록 있으면
                    if(f[i][j] > f[j][i]&& f[i][j] != -1){
                        fg[i]++;
                        f[i][j] = -1;
                        f[j][i] = -1;
                    }else if(f[i][j] < f[j][i]&& f[i][j] != -1){
                        fg[j]++;
                        f[i][j] = -1;
                        f[j][i] = -1;
                    }else { // 주고받은 수 같으면
                        // 선물 지수 비교
                        if(giftIndex[i][2] > giftIndex[j][2] && f[i][j] != -1){
                            fg[i]++;
                            f[i][j] = -1;
                            f[j][i] = -1;
                        }else if(giftIndex[i][2] < giftIndex[j][2] && f[i][j] != -1){
                            fg[j]++;
                            f[i][j] = -1;
                            f[j][i] = -1;
                        }
                        
                    }
                }else if(i != j && (f[i][j] == 0 && f[j][i] == 0)){ // 주고받은 기록 없으면
                    if(giftIndex[i][2] > giftIndex[j][2]&& f[i][j] != -1){
                        fg[i]++;
                        f[i][j] = -1;
                        f[j][i] = -1;
                    }else if(giftIndex[i][2] < giftIndex[j][2]&& f[i][j] != -1){
                        fg[j]++;
                        f[i][j] = -1;
                        f[j][i] = -1;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < fg.length; i++) {
            if (fg[i] > answer){
                answer = fg[i];
            }
        }

        
        return answer;
    }
}