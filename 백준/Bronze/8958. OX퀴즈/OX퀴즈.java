import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int score(char a[]){
        int s = 1;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 'O'){
                sum += s;
                s++;
            }
            if(a[i]=='X'){
                s = 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String quiz = br.readLine();
            char[] ox = new char[quiz.length()];
            for (int j = 0; j < ox.length; j++) {
                ox[j] = quiz.charAt(j);
            }
            bw.write(score(ox)+"\n");
        }

        bw.close();

    }
}