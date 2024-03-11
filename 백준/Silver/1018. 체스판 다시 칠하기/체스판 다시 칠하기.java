import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];
        char[][] compareBoard1 = {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        };
        char[][] compareBoard2 = {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
        };
        String color;

        for (int i = 0; i < n; i++) {
            color = (br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = color.charAt(j);
            }
        }


        int diff1 = 0;
        int diff2 = 0;
        int y = 0;
        int x = 0;
        int MinDifColor = 999;
        while (y < n - 7) {
            int difColor1 = 0;
            int difColor2 = 0;

            char[][] boardTemp = new char[8][8];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    boardTemp[i][j] = board[y + i][x + j];
                }
            }

            Loop1:
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (boardTemp[i][j] != compareBoard1[i][j]) {
                        difColor1++;
                    }
                    if (boardTemp[i][j] != compareBoard2[i][j]) {
                        difColor2++;
                    }
                    if (difColor1 >= MinDifColor && difColor2 >= MinDifColor) {
                        break Loop1;
                    }
                }
            }

            if(difColor1 > difColor2){
                MinDifColor = difColor2;
            } else {
                MinDifColor = difColor1;
            }


            x++;
            if (x > m - 8) {
                x = 0;
                y++;
            }
        }


        bw.write(MinDifColor + "");
        bw.close();
    }
}