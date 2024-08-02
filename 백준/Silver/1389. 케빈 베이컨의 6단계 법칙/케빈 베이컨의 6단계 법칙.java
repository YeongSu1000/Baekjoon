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

        int[][] list = new int[n][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()) - 1;
            int node2 = Integer.parseInt(st.nextToken()) - 1;
            list[node1][node2] = 1;
            list[node2][node1] = 1;
        }

        int c;
        int min = 0;
        int kebin = 30000000;
        for (int i = 0; i < list.length; i++) {
            // 이 과정은 루트 별 케빈 베이컨을 찾는 과정이다.
            c = root(i, list);
            if (c < kebin) {
                kebin = c;
                min = i + 1;
            }
        }
        bw.write(min + "");
        bw.close();
    }

    static int end;
    static int front;
    static int size;
    static boolean[] visited;
    static int[] queue;
    static int count;
    static int countD;
    static int d1;
    static int d2;
    static int popCount;

    static int root(int i, int[][] list) {

        queue = new int[list.length];
        visited = new boolean[list.length];

        countD = 1;
        count = 0;
        front = 0;
        end = 0;
        size = 0;
        d1 = 0;
        d2 = 0;
        popCount = 0;

        visited[i] = true;
        for (int j = 0; j < list.length; j++) {
            if (list[i][j] == 1) {
                push(j + 1);
                visited[j] = true;
                d1++;
            }
        }

        while (size > 0) {
            int node = queue[front];
            search(list, node);
            pop();
            popCount++;

            count += countD;
            if (popCount == d1 && size > 0) {
                d1 = d2;
                d2 = 0;
                popCount = 0;
                countD++;
            }
        }
        return count;
    }

    static void search(int[][] list, int node) {

        for (int i = 0; i < list.length; i++) {
            int findNode = list[node - 1][i];
            pushSearch(findNode, i);
        }
    }

    static void pushSearch(int findNode, int i) {
        if (findNode == 1 && !visited[i]) {
            visited[i] = true;
            push(i + 1);
            d2++;
        }
    }

    static void push(int node) {
        queue[end] = node;
        end++;
        if (end == queue.length) {
            end = 0;
        }
        size++;
    }

    static void pop() {
        front++;
        if (front == queue.length) {
            front = 0;
        }
        size--;
    }
}