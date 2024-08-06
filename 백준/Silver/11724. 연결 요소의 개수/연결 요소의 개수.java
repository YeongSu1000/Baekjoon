import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.write(count + "");
        bw.close();
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int m;
    static int count = 0;
    static boolean[][] visited;
    static boolean[] noNode;
    static Queue<Integer> q;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][n];
        noNode = new boolean[n];
        q = new LinkedList<>();
        int x, y;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            visited[y - 1][x - 1] = true;
            visited[x - 1][y - 1] = true;
            noNode[x - 1] = true;
            noNode[y - 1] = true;
        }
        searchNoNode();
    }

    static void solve() {
        // [0][0~size]
        // y = 현재 탐색 노드 x = 다음 노드
        for (int i = 0; i < n; i++) {
            // true, x-1,y-1 q.add visited = false
            searchNode(i);
        }
    }

    static void searchNode(int y) {
        boolean node = false;
        q.add(y);
        while (!q.isEmpty()) {
            int dy = q.poll();
            for (int i = 0; i < n; i++) { // 다음 경로 있는지
                if (visited[dy][i]) {
                    visited[dy][i] = false;
                    visited[i][dy] = false;
                    q.add(i);
                    node = true;
                }
            }
        }
        if (node) {
            count++;
        }
    }

    static void searchNoNode() {
        for (int i = 0; i < n; i++) {
            if (!noNode[i]) {
                count++;
            }
        }
    }
}