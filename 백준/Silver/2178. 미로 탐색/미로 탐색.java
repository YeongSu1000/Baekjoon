import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static Queue<int[]> q;
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.valueOf(s.charAt(j) + "");
                if(arr[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }

        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            bfs();
        }

        bw.write(arr[n-1][m-1] + "");

    }

    static void bfs() {
        int[] dot = q.poll();
        int y = dot[0];
        int x = dot[1];
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            move(nx, ny, x, y);

        }

    }

    static void move(int nx, int ny, int x, int y) {
        if (ny < 0 || ny >= arr.length || nx < 0 || nx >= arr[0].length) {

        } else if (visited[ny][nx]) {

        } else {
            q.offer(new int[]{ny, nx});
            visited[ny][nx] = true;
            arr[ny][nx] = arr[y][x] + 1;
        }
    }
}