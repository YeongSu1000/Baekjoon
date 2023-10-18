import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> nickname = new HashSet<String>(); // 닉네임
        int n = sc.nextInt();

        int hi = 0; // 이모티콘 사용 횟수
        String chated = ""; // 닉네임 저장
        String input;
        while (n-->0) {
            input = sc.next(); // 닉네임 입력

            // ENTER or Nickname , 닉네임인지 사람이 들어온건지 확인
            if (input.equals("ENTER")) { // ENTER 입력 시 기록 초기화
                nickname.clear();
            } // 중복 검사
             else if(!nickname.contains(input)){ // ENTER 가 아닌 닉네임을 입력할 경우 이모티콘 횟수 추가 + 중복 검사
                hi++; // 이모티콘 사용 횟수 증가
                nickname.add(input); // 기록에 닉네임 추가
            }
        }
        System.out.println(hi);
    }
}
