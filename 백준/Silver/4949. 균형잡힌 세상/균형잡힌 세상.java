import java.io.*;

public class Main {
    public static String bracket(String s) {
        int size = 0;
        char[] b = new char[100];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[') {
                openBracket(a, b, size);
                size++;
            } else if (a == ')' || a == ']') {
                if(size == 0){
                    return "no";
                }
                if (closeBracket(a, b, size) == 1) {
                    size--;
                } else return "no";
            }
        }

        if (size == 0) {
            return "yes";
        } else return "no";

    }

    public static void openBracket(char a, char[] arr, int size) {
        if(a=='('){
            arr[size] = ')';
        }else arr[size] = ']';
    }

    public static int closeBracket(char a, char[] arr, int size) {
        char b = a;
        if (arr[size - 1] == b) {

            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String n = br.readLine();
            if (n.equals(".")) {
                break;
            }
            bw.write(bracket(n)+"\n");
        }
        bw.close();

    }
}