import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int a = 0;
        int b = 0;
        char c;
        for (int i = 0; i < s.length(); i+=2) {
            c = s.charAt(i);
            if(c=='A'){
                a+=s.charAt(i+1);
            }else{
                b+=s.charAt(i+1);
            }
        }
        if(a>b){
            bw.write("A");
        }else bw.write("B");

        bw.close();
    }
}