import java.io.*;

public class Main {
    static int first = 0;
    static int last = 0;

    public static void push(int x, int[] que) {
        que[last] = x;
        last++;
    }

    public static int pop(int[] que) {
        int r = -1;
        if(last - first == 0){
            return r;
        }else {
            r = que[first];
            que[first] = 0;
            first++;
            return r;
        }
    }

    public static int size() {
        return last - first;
    }

    public static int empty() {
        if (last - first > 0){
            return 0;
        } else return 1;
    }

    public static int front(int[] que) {
        if(last - first == 0){
            return -1;
        }else return que[first];
        
    }

    public static int back(int[] que){
        if(last - first == 0){
            return -1;
        }else return que[last - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] que = new int[n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.contains("push")){
                int x = Integer.parseInt(s.substring(s.indexOf(" ")+1));
                push(x, que);
            }else if(s.equals("pop")){
                bw.write(pop(que) + "\n");
            }else if(s.equals("size")){
                bw.write(size() + "\n");
            }else if(s.equals("empty")){
                bw.write(empty() + "\n");
            }else if(s.equals("front")){
                bw.write(front(que) + "\n");
            }else if(s.equals("back")){
                bw.write(back(que) + "\n");
            }
        }

        bw.close();

    }
}