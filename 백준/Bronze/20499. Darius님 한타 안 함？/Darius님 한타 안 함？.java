import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String kda = br.readLine();

        int k = Integer.parseInt(kda.split("/")[0]);
        int d = Integer.parseInt(kda.split("/")[1]);
        int a = Integer.parseInt(kda.split("/")[2]);

        if(k+a<d || d==0){
            bw.write("hasu\n");
        }else{
            bw.write("gosu\n");
        }

        bw.close();
    }
}