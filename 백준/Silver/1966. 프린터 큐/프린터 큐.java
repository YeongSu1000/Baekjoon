import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            Queue<Integer> q = new LinkedList<>();
            Queue<Integer> qi = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 문서 갯수
            int m = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄 되었는지 궁금한 문서

            for (int j = 0; j < n; j++) {
                q.add(j);
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                qi.add(Integer.parseInt(st.nextToken()));
            }
            int a = -1;
            int count = 0;
            while (a != m) {
                count++;
                int temp = qi.peek();
                int size = qi.size();
                int index = 0;
                for (int j = 0; j < size; j++) {
                    int temp2 = qi.poll();
                    qi.add(temp2);
                    if (temp < temp2) {
                        temp = temp2;
                        index = j; // 가장 높은 중요도
                    }
                }
                for (int j = 0; j < index; j++) {
                    temp = qi.poll();
                    qi.add(temp);
                    temp = q.poll();
                    q.add(temp);
                }
                qi.remove();
                a = q.poll();
            }
            bw.write(count+"\n");
        }

        bw.close();

    }
}