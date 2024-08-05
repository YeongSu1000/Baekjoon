import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            input();
            int ans = search();
            bw.write(ans + "\n");
        }
        bw.close();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int m;
    static int k;
    static int t;
    static int count;
    static int[][] arr;
    static boolean[][] visited;
    static StringTokenizer st;

    static Queue<Integer> x;
    static Queue<Integer> y;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        x = new LinkedList<>();
        y = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 0;
            }
        }

        int a;
        int b;

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[b][a] = 1;
            visited[b][a] = true;
        }
    }

    static void move() {

        // 1. 배추밭 0,0 부터 탐색
        // 2. true일 경우 벌레 추가, 큐에 넣고 인접 탐색. false로 변경
        // 3. 큐가 비워지면 탐색 계속

        int xx = x.poll();
        int yy = y.poll();
        // 상. y--
        if (yy > 0 && visited[yy - 1][xx]) {
            find(xx, yy - 1);
        }
        // 하. y++
        if (yy < n - 1 && visited[yy + 1][xx]) {
            find(xx, yy + 1);
        }
        // 좌. x--
        if (xx > 0 && visited[yy][xx - 1]) {
            find(xx - 1, yy);
        }
        //우
        if (xx < m - 1 && visited[yy][xx + 1]) {
            find(xx + 1, yy);
        }
    }

    static void find(int xx, int yy) {
        visited[yy][xx] = false;
        x.add(xx);
        y.add(yy);
    }

    static int search() {
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && visited[i][j]) {
                    visited[i][j] = false;
                    x.add(j);
                    y.add(i);
                    count++;
                    moveAndFind();
                }
            }
        }
        return count;
    }

    static void moveAndFind() {
        while (!x.isEmpty() && !y.isEmpty()) {
            move();
        }
    }
}