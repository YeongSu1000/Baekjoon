import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }
    
    static PriorityQueue<Integer> pQ;

    static void input() throws IOException {
        int n = Integer.parseInt(br.readLine());
        pQ = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            zeroOrNum(num);
        }
        
    }

    static void zeroOrNum(int num) throws IOException {
        if(num == 0){
            test2();
        }else {
            test1(num);
        }
    }

    static void test1(int num) {
        pQ.add(num);
    }
    static void test2() throws IOException{
        if(pQ.isEmpty()){
            bw.write("0\n");
        }else{
            bw.write(pQ.poll() + "\n");
        }
    }
}