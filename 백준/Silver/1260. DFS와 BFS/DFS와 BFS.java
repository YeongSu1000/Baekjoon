import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        list = new int[n][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()) - 1;
            int node2 = Integer.parseInt(st.nextToken()) - 1;
            list[node1][node2] = 1;
            list[node2][node1] = 1;
        }

        visited = new boolean[n];

        // dfs 구성 코드
        stack = new Stack<>();
        // 1. 루트 노드 v
        stack.push(v);
        bw.write(v + " ");
        // 2. v에 방문 했다.
        visited[v - 1] = true;
        // 3. 루트부터 탐색
        while (!stack.isEmpty()) {
            // 4. 스택의 마지막 = 인접 노드 탐색 할 노드
            int node = stack.pop();
            // 5. 인접 노드 찾는 코드
            int visit = dfs(node);
            if (visit > 0) {
                bw.write(visit + " ");
            }
        }
        bw.write("\n");

        visited = new boolean[n];

        // bfs 구성 코드
        queue = new LinkedList<>();
        // 1. 루트 노드 v
        queue.add(v);
        
        // 2. v에 방문 했다
        visited[v - 1] = true;
        // 3. 루트부터 탐색
        while (!queue.isEmpty()) {
            // 4. 큐 첫번째 값 = 인접 노드 탐색
            int node = queue.poll();
            bw.write(node + " ");
            // 5. 인접 노드 찾아
            bfs(node);

        }


        bw.close();
    }

    static Queue<Integer> queue;

    public static void bfs(int node) {
        for (int i = 0; i < list.length; i++) {
            if (list[node - 1][i] == 1 && !visited[i]) {
                queue.add(i + 1);
                visited[i] = true;
            }
        }
    }

    static Stack<Integer> stack;
    static boolean[] visited;
    static int[][] list;

    public static int dfs(int node) {
        //5. node 의 인접노드 찾기
        for (int i = 0; i < list.length; i++) {
            // 6. i가 인접 노드 일 경우
            // 인접 노드는 i + 1 이다.
            if (list[node - 1][i] == 1 && !visited[i]) {
                // 스텍에 인접 노드 추가.
                stack.push(node);
                stack.push(i + 1);
                visited[i] = true;
                // 하고 바로 그거 인접노드 찾기
                return i + 1;
            }
        }
        return 0;
    }
}