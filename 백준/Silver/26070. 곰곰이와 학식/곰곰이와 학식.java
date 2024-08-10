import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int[] gom;
    static int[] paper;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        gom = new int[3];
        paper = new int[3];
        gom[0] = Integer.parseInt(st.nextToken());
        gom[1] = Integer.parseInt(st.nextToken());
        gom[2] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        paper[0] = Integer.parseInt(st.nextToken());
        paper[1] = Integer.parseInt(st.nextToken());
        paper[2] = Integer.parseInt(st.nextToken());

        long c = 0;
        c += test(0);
        c += test(1);
        c += test(2);
        while ((paper[0] > 2 || paper[1] > 2 || paper[2] > 2) && gom[0]+gom[1]+gom[2] !=0) {
            c += change(0);
            c += change(1);
            c += change(2);
        }
        bw.write(c + "");
    }

    static int test(int i) {
        int r = 0;
        if (gom[i] >= paper[i]) {
            gom[i] -= paper[i];
            r = paper[i];
            paper[i] = 0;
        } else {
            paper[i] -= gom[i];
            r = gom[i];
            gom[i] = 0;
        }
        return r;
    }

    static int change(int i) {
        int next = i + 1;
        if (next == 3) {
            next = 0;
        }
        if (paper[i] > 2) {
            paper[next] += paper[i] / 3;
            paper[i] %= 3;
            return test(next);
        }
        return 0;
    }
}