import java.io.*;

public class Main {
    static int size = 0;

    public static void push(int x, int[] stack) {
        stack[size] = x;
        size++;
    }

    public static int pop(int[] stack) {
        int r = -1;
        if (size == 0) {
            return r;
        }else{
            r = stack[size - 1];
            stack[size - 1] = 0;
            size--;
        }
        return r;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0){
            return 1;
        }else return 0;
    }

    public static int top(int[] stack) {
        if(size == 0){
            return -1;
        }else return stack[size - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.contains("push")){
                int x = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                push(x, stack);
            }else if(s.equals("pop")){
                bw.write(pop(stack) + "\n");
            }else if(s.equals("size")){
                bw.write(size() + "\n");
            }else if(s.equals("empty")){
                bw.write(empty() + "\n");
            }else if(s.equals("top")){
                bw.write(top(stack) + "\n");
            }
        }

        bw.close();

    }
}