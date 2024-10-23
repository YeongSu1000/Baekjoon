import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int nameLength = Integer.parseInt(br.readLine());
        String name = br.readLine();
        for (int j = 0; j < name.length(); j++) {
            bw.write(iOrL(name.charAt(j)));
        }
        bw.close();
    }

    public static char iOrL(char name) {
        if (name == 'I') {
            return 'i';
        }
        if (name == 'l'){
            return 'L';
        }
        return ' ';
    }
}