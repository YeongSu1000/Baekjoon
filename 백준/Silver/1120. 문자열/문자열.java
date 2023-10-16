import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.next());
        String b = sc.next();
        int aLength = a.length();
        int count = 0;
        int temp = 0;

        if (a.length() == b.length()) { // a, b 길이 같을경우
            count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    count++;
                }
            }
            temp = count;
        } else if (a.length() != b.length()) { // a, b 길이가 다를 경우

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    count++;
                }
            }
            temp = count; // 최소 차이 위치 저장 temp


            for (int i = 0; i < b.length() - aLength; i++) { // a를 옮겨가며 b에 대입해서 차이가 가장 작은위치 찾기.
                // a 앞에 공백 추가 b와 길이 같아질 때 까지 , 그러면서 b와 갯수차이 비교하고 차이 적은거 찾음.
                count = 0;
                a.insert(0, " ");
                for (int j = i + 1; j < a.length(); j++) {
                    if (a.charAt(j) != b.charAt(j)) {
                        count++;
                    }
                }
                if (count < temp) {
                    temp = count;
                }
            }
        }
        System.out.println(temp);
    }
}
