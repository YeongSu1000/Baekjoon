import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        month--;
        while (month > 0) {
            month = month(month);
        }

        count += day;

        switch (count % 7) {
            case 1:
                bw.write("MON");
                break;
            case 2:
                bw.write("TUE");
                break;
            case 3:
                bw.write("WED");
                break;
            case 4:
                bw.write("THU");
                break;
            case 5:
                bw.write("FRI");
                break;
            case 6:
                bw.write("SAT");
                break;
            case 0:
                bw.write("SUN");
                break;
        }
        bw.close();
    }

    static int count = 0;

    static int month(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            // 31
            count += 31;
        } else if (m == 2) {
            // 28
            count += 28;
        } else {
            // 30
            count += 30;
        }
        return m - 1;
    }
}