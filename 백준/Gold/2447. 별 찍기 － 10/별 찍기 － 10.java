import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }
        drawBoard(board, 0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(board[i][j] + "");
            }
            bw.write("\n");
        }
        bw.close();
    }
    
    static void drawBoard(char[][] board, int x, int y, int size) {
        for (int i = y + size / 3; i < y + size / 3 * 2; i++) {
            for (int j = x + size / 3; j < x + size / 3 * 2; j++) {
                board[i][j] = ' ';
            }
        }

        if(size>3){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int dx = x + j * size / 3;
                    int dy = y + i * size / 3;
                    drawBoard(board, dx, dy, size / 3);

                }
            }
        }
    }
}