import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // B진법 수 N이 주어짐.
        // 이 수를 10진법으로 바꿔 출력
        // A : 10 , ... Z : 35
        // 입력 N , B
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        int temp = 0;
        int result = 0;
        int count = 0;
        // 55 빼
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) >= 65) {
                temp = n.charAt(i) - 55;
            } else {
                temp = Integer.parseInt(String.valueOf(n.charAt(i)));
            }

            for (int j = 0; j < count; j++) {
                temp *= b;
            }
            result += temp;
            count++;
        }
        System.out.println(result);
    }
}