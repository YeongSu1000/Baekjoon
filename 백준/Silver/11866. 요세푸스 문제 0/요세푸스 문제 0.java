import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // n,k
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = i + 1;
        }

        int first = 0;
        int last = n - 1;
        int size = n;
        bw.write("<");
        while (size > 1) {

            for (int i = 0; i < k - 1; i++) {
                last++;
                if (last > n - 1) {
                    last = 0;
                }


                list[last] = list[first];
                first++;

                if(first > n - 1){
                    first = 0;
                }
            }

            // pop
            bw.write(list[first] + ", ");
            first++;
            if(first > n - 1){
                first = 0;
            }

            size--;
        }
        bw.write(list[last] + ">");


        bw.flush();
        bw.close();
    }
}
