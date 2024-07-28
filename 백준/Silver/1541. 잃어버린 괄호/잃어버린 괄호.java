import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String s2 = "";
        int start = 0;
        int number = 0;

        while (start < s.length()) {

            String num = "";

            for (int i = start; i < s.length(); i++) {

                if (s.charAt(i) == '-') {
                    start = i + 1;
                    number += Integer.parseInt(num);
                    s2 += number;
                    s2 += "-";
                    number = 0;
                    break;
                } else if (s.charAt(i) == '+') {
                    start = i + 1;
                    number += Integer.parseInt(num);
                    break;
                } else {
                    num += s.charAt(i);
                }
                if (i == s.length() - 1) {
                    number += Integer.parseInt(num);
                    s2 += number;
                    start = s.length();
                }
            }
            if (start == s.length()) {
                start = 0;
                number = 1000000;
                break;
            }

        }

        while (start < s2.length()) {
            String num = "";
            for (int i = start; i < s2.length(); i++) {
                if (s2.charAt(i) == '-') {
                    start = i + 1;
                    if (number == 1000000) {
                        number = 0;
                        number += Integer.parseInt(num);
                    } else {
                        number -= Integer.parseInt(num);
                    }
                    break;
                } else {
                    num += s2.charAt(i);
                }
                if (i == s2.length() - 1) {
                    if (number == 1000000) {
                        number = Integer.parseInt(num);
                    } else {
                        number -= Integer.parseInt(num);
                    }

                    start = s2.length();
                }
            }
            if (start == s2.length()) {
                break;
            }
        }
        bw.write(number + "");
        bw.close();
    }
}