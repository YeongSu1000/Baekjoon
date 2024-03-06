import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        WordTime wt = new WordTime();
        int t = 0;
        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            t += wt.WordTime(line.charAt(i));
        }



        bw.write(t+"\n");
        bw.close();
    }
}

class WordTime {
    int WordTime(char a) {
        int r = 0;
        if (a >= 65 && a <= 67) {
            r = 3;
        } else if (a >= 68 && a <= 70) {
            r = 4;
        } else if (a >= 71 && a <= 73) {
            r = 5;
        } else if (a >= 74 && a <= 76) {
            r =  6;
        } else if (a >= 77 && a <= 79) {
            r = 7;
        } else if (a >= 80 && a <= 83) {
            r = 8;
        } else if (a >= 84 && a <= 86) {
            r = 9;
        } else if (a >= 87 && a <= 90) {
            r = 10;
        }
        return r;
    }
}
