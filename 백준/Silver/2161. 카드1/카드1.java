import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n장의 카드 입력 , 1번 맨 위 n번 맨 아래
        // 출력 - 버린 카드 순서대로 , 마지막 남은 카드

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> card = new ArrayList<>();
        int[] dump = new int[n - 1];
        for (int i = 1; i <= n; i++) {
            card.add(i);
        }
        int dumpCount = 0;
        while (card.size() > 1) {
            dump[dumpCount] = card.get(0); // 카드 버리기
            card.remove(0);

            if (card.size() != 1) {
                card.add(card.get(0)); // 카드 맨 아래로
                card.remove(0);
            } else {
                break;
            }
            dumpCount++;
        }
        for (int i = 0; i < dump.length; i++) {
            System.out.print(dump[i] + " ");
        }
        System.out.println(card.get(0));

    }
}
