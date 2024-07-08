import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cord = "";
        while ((cord = br.readLine()) != null) {

            for (int i = 0; i < cord.length(); i += 2) {
                int decimal = (cord.charAt(i) - 48) * 16;
                if(cord.charAt(i + 1) >= 65){
                    switch (cord.charAt(i + 1)){
                        case 'A':
                            decimal += 10;
                            break;
                        case 'B':
                            decimal += 11;
                            break;
                        case 'C':
                            decimal += 12;
                            break;
                        case 'D':
                            decimal += 13;
                            break;
                        case 'E':
                            decimal += 14;
                            break;
                        case 'F':
                            decimal += 15;
                            break;
                    }
                }else{
                    decimal += cord.charAt(i + 1) - 48;
                }

                bw.write( (char) decimal + "");
            }

            bw.write("\n");
        }

        bw.close();
    }
}