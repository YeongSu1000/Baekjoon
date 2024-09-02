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
        int a = Integer.parseInt(st.nextToken());

        switch (a) {
            case 1:
                push(Integer.parseInt(st.nextToken()));
                break;
            case 2:
                pop();
                break;
            case 3:
                size();
                break;
            case 4:
                empty();
                break;
            case 5:
                print();
                break;
        }
    }

    static void push(int num) {
        arr[end] = num;
        end++;
        size++;
        if (end > arr.length) {
            end = 0;
        }
    }

    static void pop() throws IOException {
        if (size > 0) {
            end--;
            bw.write(arr[end] + "\n");
            size--;
        } else {
            bw.write("-1\n");
        }
        if (start > arr.length) {
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

    static void print() throws IOException {
        if (size == 0) {
            bw.write("-1\n");
        } else {
            if(end - 1 == -1){
                bw.write(arr[arr.length - 1] + "\n");
            }else{
                bw.write(arr[end - 1] + "\n");
            }
        }
    }
}