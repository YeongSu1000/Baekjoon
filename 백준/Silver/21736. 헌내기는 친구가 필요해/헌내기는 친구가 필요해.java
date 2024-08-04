import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();

        while (!x.isEmpty()) {
            move();
        }
        if (count == 0) {
            bw.write("TT");
        } else bw.write(count + "");
        bw.close();
    }

    static int n;
    static int m;
    static int count = 0;
    static char[][] arr;
    static boolean[][] visited;

    static Queue<Integer> x;
    static Queue<Integer> y;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        visited = new boolean[n][m];
        x = new LinkedList<>();
        y = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'X') visited[i][j] = true;
                if (arr[i][j] == 'I') {
                    x.add(j);
                    y.add(i);
                    visited[i][j] = true;
                }
            }
        }
    }

    static void move() {
        // 큐 값 빼고 상,하,좌,우 탐색
        // 벽인지 방문 했는지
        int xx = x.poll();
        int yy = y.poll();
        // 상. y--
        if (yy > 0 && !visited[yy - 1][xx]) {
            find(xx, yy - 1);
        }
        // 하. y++
        if (yy < n - 1 && !visited[yy + 1][xx]) {
            find(xx, yy + 1);
        }
        // 좌. x--
        if (xx > 0 && !visited[yy][xx - 1]) {
            find(xx - 1, yy);
        }
        //우
        if (xx < m - 1 && !visited[yy][xx + 1]) {
            find(xx + 1, yy);
        }
    }

    static void find(int xx, int yy) {
        visited[yy][xx] = true;
        x.add(xx);
        y.add(yy);
        if (arr[yy][xx] == 'P') {
            count++;
        }
    }
}