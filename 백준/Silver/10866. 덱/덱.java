import java.io.*;

public class Main {
    static int size = 0;
    static int first = 0;
    static int last = -1;

    public static void push_front(int x, int[] deque) { // stack
        first--;
        if (first < 0) {
            first = deque.length - 1;
        }
        deque[first] = x;
        size++;
    }

    public static void push_back(int x, int[] deque) { // que
        last++;
        if (last == deque.length || last == 0) {
            last = 0;
        }
        deque[last] = x;
        size++;
    }

    public static int pop_front(int[] deque) {
        int r = -1;
        if (size == 0) {
            return r;
        } else {
            if (first == deque.length - 1) {
                r = deque[first];
                first = 0;
            } else {
                first++;
                r = deque[first - 1];
            }
            size--;
            return r;
        }
    }

    public static int pop_back(int[] deque) {
        int r = -1;
        if (size == 0) {
            return r;
        } else {
            if (last == 0) {
                last = deque.length - 1;
                r = deque[0];

            } else if (last < 0) {
                last = deque.length - 1;
                r = deque[last];
                last--;
            } else {
                r = deque[last];
                last--;
            }
            size--;
            return r;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else return 0;
    }

    public static int front(int[] deque) {
        if (size == 0) {
            return -1;
        } else {
            return deque[first];
        }
    }

    public static int back(int[] deque) {
        if (size == 0) {
            return -1;
        } else {
            if(last < 0){
            return deque[deque.length-1];
        }
            return deque[last];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] deque = new int[n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.contains("push_front")) {
                int x = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
                push_front(x, deque);
            } else if (s.contains("push_back")) {
                int x = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
                push_back(x, deque);
            } else if (s.equals("pop_front")) {
                bw.write(pop_front(deque) + "\n");
            } else if (s.equals("pop_back")) {
                bw.write(pop_back(deque) + "\n");
            } else if (s.equals("size")) {
                bw.write(size() + "\n");
            } else if (s.equals("empty")) {
                bw.write(empty() + "\n");
            } else if (s.equals("front")) {
                bw.write(front(deque) + "\n");
            } else if (s.equals("back")) {
                bw.write(back(deque) + "\n");
            }
        }

        bw.close();

    }
}