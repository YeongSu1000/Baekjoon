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
        start = arr.length - 1;
        end = 0;
        size = 0;
        for (int i = 0; i < n; i++) {
            test();
        }
    }

    static void test() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        switch (a) {
            case 1:
                addFirst(Integer.parseInt(st.nextToken()));
                break;
            case 2:
                addLast(Integer.parseInt(st.nextToken()));
                break;
            case 3:
                popFirst();
                break;
            case 4:
                popLast();
                break;
            case 5:
                size();
                break;
            case 6:
                empty();
                break;
            case 7:
                printFirst();
                break;
            case 8:
                printLast();
                break;
        }
    }

    static void addFirst(int num) {
        arr[start] = num;
        start--;
        size++;
        if (start == -1) {
            start = arr.length - 1;
        }
    }

    static void addLast(int num) {
        arr[end] = num;
        end++;
        size++;
        if (end == arr.length) {
            end = 0;
        }
    }

    static void popFirst() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else {
            start++;
            if (start == arr.length) {
                start = 0;
            }
            size--;
            bw.write(arr[start] + "\n");
        }
    }

    static void popLast() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else{
            end--;
            if (end == -1) {
                end = arr.length - 1;
            }
            size--;
            bw.write(arr[end] + "\n");
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

    static void printFirst() throws IOException {
        if(size == 0){
            bw.write("-1\n");
        }else{
            int n = start + 1;
            if(n == arr.length){
                n = 0;
            }
            bw.write(arr[n] + "\n");
        }
    }

    static void printLast() throws IOException {
        if(size == 0){
            bw.write("-1\n");
        }else{
            int n = end - 1;
            if(n == -1){
                n = arr.length - 1;
            }
            bw.write(arr[n] + "\n");
        }
    }
}