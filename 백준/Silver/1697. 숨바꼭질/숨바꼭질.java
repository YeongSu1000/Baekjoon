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

    static int m;
    static int n;
    static Queue<Integer> q;
    static int[] visited;
    static int[] time;

    static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int size = 200000;
        visited = new int[size]; // +1 해야 할 수도.
        time = new int[size];
        q = new LinkedList<Integer>();
        q.add(n);
        visited[n] = 0;
        int i = 0;
        time[0] = 1;

        if (n == m) {
            bw.write("0");
        } else if (m < n) {
            bw.write(n - m + "");
        } else {
            while (!q.isEmpty()) {
                test(i);
                i++;
            }

            bw.write(visited[m] + "");
        }


    }

    static void test(int i) {
        for (int j = 0; j < time[i]; j++) {
            move(i);
        }
    }

    static void move(int i) {
        int k = q.poll();

        if (k < m) {
            moveR(k + 1, i);
            moveMul(k * 2, i);
        }
        if (k > 1) {
            moveL(k - 1, i);
        }

    }

    static void moveR(int k, int i) {
        if (visited[k] == 0) {
            q.add(k);
            visited[k] = i + 1;
            time[i + 1]++;
        }
    }

    static void moveL(int k, int i) {
        if (visited[k] == 0) {
            q.add(k);
            visited[k] = i + 1;
            time[i + 1]++;
        }
    }

    static void moveMul(int k, int i) {
        if (visited[k] == 0) {
            q.add(k);
            visited[k] = i + 1;
            time[i + 1]++;
        }
    }
}