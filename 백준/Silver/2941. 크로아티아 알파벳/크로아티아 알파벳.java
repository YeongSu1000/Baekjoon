import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // c= c- dz= d- lj nj s= z=
        // c= s= z=
        // c- d-
        // dz=
        // lj nj
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String str = a.readLine();
        StringBuffer sb = new StringBuffer(str);

        int count = 0;
        while (sb.length() > 0) {

            if ((sb.charAt(0) == 'c' || sb.charAt(0) == 's' || sb.charAt(0) == 'z') && sb.length() > 1) {
                if (sb.charAt(1) == '=') {
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    count++;
                } else if (sb.charAt(0) == 'c' && sb.charAt(1) == '-') {
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    count++;
                }else{
                    sb.deleteCharAt(0);
                    count++;
                }
            } else if (sb.charAt(0) == 'd' && sb.length() > 1) {
                if (sb.charAt(1) == '-') {
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    count++;
                } else if (sb.charAt(0) == 'd' && sb.length() > 2) {
                    if (sb.charAt(1) == 'z' && sb.charAt(2) == '=') {
                        sb.deleteCharAt(0);
                        sb.deleteCharAt(0);
                        sb.deleteCharAt(0);
                        count++;
                    } else {
                        sb.deleteCharAt(0);
                        count++;
                    }
                } else {
                    sb.deleteCharAt(0);
                    count++;
                }

            } else if ((sb.charAt(0) == 'l' || sb.charAt(0) == 'n') && sb.length() > 1) {
                if (sb.charAt(1) == 'j') {
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(0);
                    count++;
                } else {
                    sb.deleteCharAt(0);
                    count++;
                }


            } else {
                sb.deleteCharAt(0);
                count++;
            }
        }
        System.out.println(count);
    }
}
