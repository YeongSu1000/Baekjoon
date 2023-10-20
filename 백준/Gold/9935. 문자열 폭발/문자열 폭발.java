import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String str = a.readLine();
        String bomb = a.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean same = true;
                int idx = stack.size() - bomb.length();

                for (int j = idx; j < stack.size(); j++) {
                    if (stack.get(j) != bomb.charAt(j - idx)) {
                        same = false;
                        break;
                    }
                }
                if (same) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }

                }
            }
        }
        if (stack.size() == 0) {
            System.out.println("FRULA");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack)
            result.append(ch);
        System.out.println(result.toString());

    }
}