import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int first = 0;
        int last = 0;

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    int add = Integer.parseInt(st.nextToken());
                    list[last] = add;
                    last++;

                    break;
                case "pop":
                    if (first == last) {
                        bw.write("-1\n");
                    } else {
                        bw.write(list[first] + "\n");
                        first++;
                    }

                    break;
                case "size":
                    bw.write(last - first + "\n");

                    break;
                case "empty":
                    if (last - first == 0) {
                        bw.write("1\n");
                    } else bw.write("0\n");

                    break;
                case "front":
                    if (last - first == 0) {
                        bw.write("-1\n");
                    } else bw.write(list[first] + "\n");
                    
                    break;
                case "back":
                    if (last - first == 0) {
                        bw.write("-1\n");
                    } else bw.write(list[last - 1] + "\n");
                    
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
