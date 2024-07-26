import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static BigDecimal price(BigDecimal money, char color, char coupon, char payment) {

        switch (color) {
            case 'R':
                money = money.subtract(money.multiply(new BigDecimal("0.45")));
                break;
            case 'G':
                money = money.subtract(money.multiply(new BigDecimal("0.30")));
                break;
            case 'B':
                money = money.subtract(money.multiply(new BigDecimal("0.20")));
                break;
            case 'Y':
                money = money.subtract(money.multiply(new BigDecimal("0.15")));
                break;
            case 'O':
                money = money.subtract(money.multiply(new BigDecimal("0.10")));
                break;
            case 'W':
                money = money.subtract(money.multiply(new BigDecimal("0.05")));
                break;
        }

        if (coupon == 'C') {
            money = money.subtract(money.multiply(new BigDecimal("0.05")));
        }

        if (payment == 'C') {
            if(money.remainder(new BigDecimal("0.1")).compareTo(new BigDecimal("0.05")) > 0) {
                money = money.subtract(money.remainder(new BigDecimal("0.1")));
                money = money.add(new BigDecimal("0.1"));
            }else {
                money = money.subtract(money.remainder(new BigDecimal("0.1")));
            }
        }else{
            if(money.remainder(new BigDecimal("0.01")).compareTo(new BigDecimal("0.005")) > 0) {
                money = money.subtract(money.remainder(new BigDecimal("0.01")));
                money = money.add(new BigDecimal("0.01"));
            }else {
                money = money.subtract(money.remainder(new BigDecimal("0.01")));
            }
        }
        return money;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        BigDecimal a;
        char b;
        char c;
        char d;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            a = new BigDecimal(s.split(" ")[0]);
            b = s.split(" ")[1].charAt(0);
            c = s.split(" ")[2].charAt(0);
            d = s.split(" ")[3].charAt(0);

            String result = String.format("%.2f", price(a, b, c, d));
            bw.write("$" + result + "\n");
        }

        bw.close();
    }
}