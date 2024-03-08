import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());

            int quarter = 25;
            int dime = 10;
            int nickel = 5;
            int penny = 1;

            int qc = 0;
            int dc = 0;
            int nc = 0;
            int pc = 0;
            while(true){
                if (c >= quarter) {
                    qc = c / quarter;
                    c -= qc * quarter;
                } else if (c >= dime) {
                    dc = c / dime;
                    c -= dc * dime;
                } else if (c >= nickel) {
                    nc = c / nickel;
                    c -= nc * nickel;
                } else {
                    pc = c;
                    break;

                }
            }
            bw.write(qc+" ");
            bw.write(dc+" ");
            bw.write(nc+" ");
            bw.write(pc+"\n");
        }


        bw.close();
    }
}

