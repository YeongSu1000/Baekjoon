import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GroupWord g = new GroupWord(n, sc);

    }
}

class GroupWord {
    Scanner sc;

    GroupWord(int n, Scanner scanner) {
        this.sc = scanner;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(check()) {
                count++;
            }
        }
        System.out.println(count);
    }

    boolean check() {
        String a = sc.next();

        ArrayList<Character> temp = new ArrayList<>();
        temp.add(a.charAt(0));
        boolean find = true;
        for (int i = 1; i < a.length(); i++) { // 입력한 단어의 첫 인덱스 부터 검사
            if (temp.get(temp.size() - 1) == a.charAt(i)) { // 검사 인덱스 가 앞 인덱스 와 같은지 검사

            } else { // 다르면 temp 에 중복 있는지 검사
                for (int j = 0; j < temp.size() - 1; j++) {
                    if (a.charAt(i) == temp.get(j)) { // 중복 있으면 그룹 단어 아님.
                        find = false;
                    }
                }
                if(find){
                    temp.add(a.charAt(i));
                }
            }
            if (!find) {
                break;
            }
        }

        return find;
    }
}