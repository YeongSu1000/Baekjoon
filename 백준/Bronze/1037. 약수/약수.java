import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 약수 갯수
        int[] div = new int[num]; // 약수 div 에 num 만큼 저장
        int n; // N
        int max = 1; //약수 최대값
        int min = 1000000;
        for (int i = 0; i < div.length; i++) { // div에 약수 저장하기
            div[i] = sc.nextInt();
            if (div[i] > max) {
                max = div[i];
            }
            if (div[i] < min) {
                min = div[i];
            }
        }
        n = max * min;
        System.out.println(n);
    }
}
