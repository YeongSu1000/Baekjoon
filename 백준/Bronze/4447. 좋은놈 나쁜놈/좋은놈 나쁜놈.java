import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int g = 0;
            int b = 0;
            String name = br.readLine();
            String t = name.toLowerCase();
            for (int j = 0; j < name.length(); j++) {
                if (t.charAt(j) == 'g') {
                    g++;
                } else if (t.charAt(j) == 'b') {
                   b++;
                }
            }
            if (g > b){
                bw.write(name + " is GOOD");
            }else if (g < b){
                bw.write(name + " is A BADDY");
            }else{
                bw.write(name + " is NEUTRAL");
            }

            bw.write("\n");
        }

        bw.close();
    }
}