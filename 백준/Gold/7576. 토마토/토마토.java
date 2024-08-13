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
    static int[] day;
    static int dayCount = 0;
    static int k = 0;
    static int n;
    static int m;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m]; // n 세로 m 가로
        visited = new boolean[n][m];
        q = new LinkedList<int[]>();
        day = new int[n * m];
        day[0] = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    q.add(new int[]{i, j});
                    day[k] = 0;
                    k++;
                    dayCount++;
                    visited[i][j] = true;
                } else if (board[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }


        int i = 0;
        while (!q.isEmpty()) {
            test(i); // q 횟수
            i++;
        }
        bw.write(outPut() + "");
    }

    static void test(int i) {
        int[] cur = q.poll(); // y cur[0] x cur[1]
        visited[cur[0]][cur[1]] = true; // 현재 큐 방문 함
        board[cur[0]][cur[1]] = day[i]; // 현재 위치 = 날짜

        // 첫 토마토 2개
        // day[2] - 0일 저장
        //

        if (cur[0] == 0) { // 상x
            move(cur[0] + 1, cur[1], i);
        } else if (cur[0] == board.length - 1) { // 하 x
            move(cur[0] - 1, cur[1], i);
        } else {
            move(cur[0] - 1, cur[1], i);
            move(cur[0] + 1, cur[1], i);
        }

        if (cur[1] == 0) { // 좌 x
            move(cur[0], cur[1] + 1, i);
        } else if (cur[1] == board[0].length - 1) { // 우 x
            move(cur[0], cur[1] - 1, i);
        } else {
            move(cur[0], cur[1] + 1, i);
            move(cur[0], cur[1] - 1, i);

        }
        // 큐에 넣은 홧수 카운트.
        // 카운트 만큼 빼면 discount++;

    }

    static void move(int y, int x, int i) {
        if (visited[y][x]) {
            // 방문 햇거나 벽
        } else {
            // 안햇으면
            // 큐에 넣는다
            q.add(new int[]{y, x});
            visited[y][x] = true;
            day[dayCount] = day[i] + 1;
            dayCount++;
        }
    }

    static int outPut() {
        int maxDay = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j] && board[i][j] == 0) {
                    return -1;
                }
                if (board[i][j] > maxDay) {
                    maxDay = board[i][j];
                }
            }
        }
        return maxDay;
    }
}