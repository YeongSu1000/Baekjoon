import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sound = new int[8];
        for (int i = 0; i < sound.length; i++) {
            sound[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(descending, sound)) {
            bw.write("descending");
        } else if (Arrays.equals(ascending, sound)) {
            bw.write("ascending");
        } else bw.write("mixed");


        bw.close();

    }
}