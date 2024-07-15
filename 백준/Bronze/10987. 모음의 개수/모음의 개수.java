import java.io.*;

public class Main {
    public static int find(char w){
        switch (w){
            case 'a':
                return 1;
            case 'e':
                return 1;
            case 'i':
                return 1;
            case 'o':
                return 1;
            case 'u':
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String word = br.readLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count += find(word.charAt(i));
        }

        bw.write(count + "");
        bw.close();
    }
}