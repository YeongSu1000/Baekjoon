import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 홀수 반 청팀 짝수 반 백팀
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 학급 수 // 최대 10
        int m = Integer.parseInt(st.nextToken()); // 학급당 신청 가능한 인원 수 // 최대 10

        String[][] apply = new String[n][m];

        int[] classSize = new int[n];
        for (int i = 0; i < classSize.length; i++) {
            classSize[i] = 0;
        }

        while (true) { // 반과 이름 입력 받기 반복 (0 0)입력 까지
            st = new StringTokenizer(br.readLine());
            int classNum = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (classNum == 0) break;

            if(classSize[classNum - 1] < m){
                apply[classNum - 1][classSize[classNum - 1]] = name;
                classSize[classNum - 1]++;
            }

        }

        // 정렬을 해보자.
        for (int i = 0; i < n; i+=2) {
            String[] sort = new String[classSize[i]];
            for (int j = 0; j < classSize[i]; j++) {
                sort[j] = apply[i][j];
            }
            Arrays.sort(sort);
            Arrays.sort(sort, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });

            for (int j = 0; j < sort.length; j++) {
                bw.write(i + 1 + " " + sort[j] + "\n");
            }
        }

        for (int i = 1; i < n; i+=2) {
            String[] sort = new String[classSize[i]];
            for (int j = 0; j < classSize[i]; j++) {
                sort[j] = apply[i][j];
            }
            Arrays.sort(sort);
            Arrays.sort(sort, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            for (int j = 0; j < sort.length; j++) {
                bw.write(i + 1 + " " + sort[j] + "\n");
            }
        }

        bw.close();
    }
}