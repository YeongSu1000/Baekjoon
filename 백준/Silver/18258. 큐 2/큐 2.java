import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int start;
    static int end;
    static int size;

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        start = 0;
        end = 0;
        size = 0;
        for (int i = 0; i < n; i++) {
            test();
        }
    }

    static void test() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();

        switch (a) {
            case "push":
                push(Integer.parseInt(st.nextToken()));
                break;
            case "pop":
                pop();
                break;
            case "size":
                size();
                break;
            case "empty":
                empty();
                break;
            case "front":
                front();
                break;
            case "back":
                back();
                break;
        }
    }

    static void push(int num) {
        arr[end] = num;
        end++;
        size++;
        if (end == arr.length) {
            end = 0;
        }
    }

    static void pop() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else {
            bw.write(arr[start] + "\n");
            start++;
            size--;
        }

        if (start == arr.length) {
            start = 0;
        }
    }

    static void size() throws IOException {
        bw.write(size + "\n");
    }

    static void empty() throws IOException {
        if (size == 0) {
            bw.write("1\n");
        } else bw.write("0\n");
    }

    static void front() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else bw.write(arr[start] + "\n");
    }

    static void back() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else {
            int n = end;
            if(n == 0){
                n = arr.length;
            }
            bw.write(arr[n - 1] + "\n");
        }
    }
}