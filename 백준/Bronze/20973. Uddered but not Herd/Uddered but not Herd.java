import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cowphabet = br.readLine();
        String bessie = br.readLine();

        int bessieIndex = 0;
        int count = 0;
        while (bessieIndex < bessie.length()) {
            count++;
            for (int i = 0; i < cowphabet.length(); i++) {
                if (bessie.charAt(bessieIndex) == cowphabet.charAt(i)) {
                    bessieIndex++;
                }
                if(bessieIndex==bessie.length()){
                    break;
                }
            }
        }
        
        bw.write(count + "\n");
        bw.close();
    }
}