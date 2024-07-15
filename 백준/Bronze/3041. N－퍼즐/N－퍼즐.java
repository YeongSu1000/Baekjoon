import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String puzzle = "ABCDEFGHIJKLMNO.";
        String word;
        int puzzleX, puzzleY;
        int wordX, wordY;
        int distant = 0;
        char[] temp = new char[16];
        for (int i = 0; i < 4; i++) {
            word = br.readLine();
            for (int j = 0; j < 4; j++) {
                temp[i * 4 + j] = word.charAt(j);
                if (temp[i * 4 + j] != puzzle.charAt(i * 4 + j) && temp[i * 4 + j] != '.') {

                    puzzleY = puzzle.indexOf(temp[i * 4 + j]) % 4;
                    puzzleX = puzzle.indexOf(temp[i * 4 + j]) / 4;

                    wordY = (i * 4 + j) % 4;
                    wordX = (i * 4 + j) / 4;

                    distant += Math.abs(puzzleY - wordY) + Math.abs(puzzleX - wordX);

                }
            }
        }

        bw.write(distant + "");
        bw.close();
    }
}