import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Qestion a = new Qestion(n,sc);
        a.Q1();
        a.Q2();
        a.Q3();
        a.Q4();
    }
}

class Qestion {
    Scanner sc;
    int n;
    int[] num;

    public Qestion(int n,Scanner scanner) {
        this.n = n;
        this.sc=scanner;
        num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    }

    void Q1() { // 평균
        int sum = 0;
        double avr = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        avr = (double) sum / n;
        double temp = avr - sum / n;
        int result = sum / n;
        if (avr >= 0 && temp >= 0.5) { // 양수일경우 0.5 이상이면 올려지게
            result += 1;
        } else if (avr < 0 && temp <= -0.5) { // 음수일경우 0.5 이상이면 내려지게
            result -= 1;
        }
        System.out.println(result);
    }

    void Q2() { // 중앙값
        int center = n / 2;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            temp.add(num[i]);
        }
        Collections.sort(temp);
        System.out.println(temp.get(center));
    }

    void Q3() { // 최빈값 , 여러개 있을 땐 최빈값 중 두번째 작은 수
        // 나오는 값 저장.
        int[][] num = new int[this.num.length][2];
        int i = 0;
        int count = 0;
        int n = this.n;
        while (count < n) {
            num[i][0] = this.num[count];
            num[i][1] = 1;

            for (int j = 0; j < i; j++) {
                if (num[j][0] == num[i][0]) {
                    num[j][1]++;
                    i--;
                    break;
                }
            }
            i++;
            count++;
        }
        // num[i][1] 에 빈도수 입력 완료
        // 빈도수 가장 큰거 찾기
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (num[j][1] > max) {
                max = num[j][1];
            }
        }
        // 가장 큰 빈도수와 같은 값 있는지 검사
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            if ((num[j][1] == max)) {
                temp.add(num[j][0]);
            }
        }
        if (temp.size() > 1) {
            Collections.sort(temp);
            System.out.println(temp.get(1));
        } else if (temp.size() == 1) {
            System.out.println(temp.get(0));
        }
    }


    void Q4() { // 범위. n개의 수 중 최대값과 최소값의 차이
        int min = 4000;
        int max = -4000;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        int result = max - min;
        System.out.println(result);
    }
}