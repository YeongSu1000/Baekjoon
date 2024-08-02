import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }


    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        list = new int[n][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()) - 1;
            int node2 = Integer.parseInt(st.nextToken()) - 1;
            list[node1][node2] = 1;
            list[node2][node1] = 1;
        }

        count = 0;
        visited = new boolean[n];
        queue = new LinkedList<>();
        queue.add(1);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs(node);
        }
        bw.write(count + "");
        bw.close();
    }

    static Queue<Integer> queue;
    static boolean[] visited;
    static int[][] list;
    static int count;
    public static void bfs(int node) {
        for (int i = 0; i < list.length; i++) {
            if (list[node - 1][i] == 1 && !visited[i]) {
                queue.add(i + 1);
                visited[i] = true;
                count++;
            }
        }
    }
}