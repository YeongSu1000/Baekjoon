import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if(n >= 229){ // 1개
            bw.write("4");
        }else if(n>217){ // 2개
            bw.write("3");
        }else if(n>205){ // 4 개
            bw.write("2");
        }else if(n>199){ // 8 개
            bw.write("1");
        }


        bw.close();
    }
}