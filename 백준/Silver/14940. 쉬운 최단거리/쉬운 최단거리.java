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

    static int[][] board;
    static boolean[][] visited;
    static Queue<int[]> q;
    static int[] distance;
    static int count = 0;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new int[n][m]; // n 세로 m 가로
        visited = new boolean[n][m];
        q = new LinkedList<int[]>();
        distance = new int[n * m + 1];
        distance[0] = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (board[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }
        int k = 0;
        while (!q.isEmpty()) {
            test(k);
            k++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && board[i][j] == 1) {
                    board[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(board[i][j] + " ");
            }
            bw.write("\n");
        }
        // 2 목표 지점
        // 1 땅
        // 0 == 벽
        // 도달할 수 없는 위치 -1 출력

        // 목표지점 좌표. 0으로 변경
        // 상하 좌우 = 거리, 거리++
        // 상하 좌우 위치 size, 0인지 탐색
        // 0아니면 = 거리
    }

    static void test(int k) {
        int[] cur = q.poll(); // y cur[0] x cur[1]
        visited[cur[0]][cur[1]] = true; // 현재 큐 방문 함
        board[cur[0]][cur[1]] = distance[k]; // 현재 위치 = 거리

        // 상 하 좌 우 큐에 넣기


        if (cur[0] == 0) { // 상x
            move(cur[0] + 1, cur[1],k);
        } else if (cur[0] == board.length - 1) { // 하 x
            move(cur[0] - 1, cur[1],k);
        } else {
            move(cur[0] - 1, cur[1],k);
            move(cur[0] + 1, cur[1],k);
        }

        if (cur[1] == 0) { // 좌 x
            move(cur[0], cur[1] + 1,k);
        } else if (cur[1] == board[0].length - 1) { // 우 x
            move(cur[0], cur[1] - 1,k);
        } else {
            move(cur[0], cur[1] + 1,k);
            move(cur[0], cur[1] - 1,k);

        }
        // 큐에 넣은 홧수 카운트.
        // 카운트 만큼 빼면 discount++;

    }

    static void move(int y, int x, int k) {
        if (visited[y][x]) {
            // 방문 햇거나 벽
        }else {
            // 안햇으면
            // 큐에 넣는다
            q.add(new int[]{y, x});
            visited[y][x] = true;
            count += 1;
            distance[count] = distance[k] + 1;
        }
    }
}