import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 명령 갯수 입력
        int n = Integer.parseInt(br.readLine());

        int[] stack = new int[n];
        stack[0] = -1;
        int top = 0;
        // 명령 갯수만큼 명령 반복
        String command;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());

                    stack[top] = num;
                    top++;
                    break;
                case "pop":
                    if (top == 0) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack[top - 1] + "\n");
                        top--;
                    }
                    break;
                case "size":
                    bw.write(top + "\n");
                    break;
                case "empty":
                    if (top == 0) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "top":
                    if (top == 0) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack[top - 1] + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
