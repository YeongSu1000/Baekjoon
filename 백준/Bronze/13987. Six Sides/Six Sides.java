import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st1, st2;
    static int draw = 0;

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        int[] p1 = new int[6];
        int[] p2 = new int[6];
        dice(p1, p2);

        bw.write(game(p1, p2) + "\n");
    }

    static void dice(int[] p1, int[] p2) {
        for (int i = 0; i < 6; i++) {
            p1[i] = Integer.parseInt(st1.nextToken());
            p2[i] = Integer.parseInt(st2.nextToken());
        }
    }

    static int p1WinCount(int p1, int[] p2, int i) {
        int win = 0;
        for (int j = 0; j < 6; j++) {
            if (p1 > p2[j]) {
                win++;
            } else if (p1 == p2[j]) {
                draw++;
            }
        }
        return win;
    }

    static String game(int[] p1, int[] p2) throws IOException {
        int win = 0;
        for (int i = 0; i < 6; i++) {
            win += p1WinCount(p1[i], p2, i);
        }
        String result = String.format("%.5f", (double) win / (36 - draw));
        return result;
    }
}