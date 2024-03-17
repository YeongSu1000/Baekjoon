import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int year = 2014;
        int month = 4;
        int day = 2;

        LocalDate oneDay = LocalDate.of(year, month, day);
        oneDay = oneDay.plusDays(n - 1);

        bw.write(String.valueOf(oneDay) + "\n");


        bw.close();
    }
}