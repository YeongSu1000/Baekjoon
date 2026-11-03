import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int month = sc.nextInt();
            int day = sc.nextInt();
            int month2 = sc.nextInt();
            int day2 = sc.nextInt();
            int count = 0;
            while (month2 > month) { // 월이 다를 경우
                // 첫 번째 날짜 ~ 두번째 날짜 전달 마지막일까지 계산
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8: 
                    case 10: 
                    case 12:
                        if (count == 0) {
                            count = 31 - day + 1;
                        } else {
                            count += 31;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (count == 0) {
                            count = 30 - day + 1;
                        } else {
                            count += 30;
                        }
                        break;
                    case 2:
                        if (count == 0) {
                            count = 28 - day + 1;
                        } else {
                            count += 28;
                        }
                        break;
                }
                month++;
            }
    
            if(count == 0){ // 첫번째 달과 두번째 달이 같을 때
                count = day2 - day + 1;
            }else{
                count += day2;
            }
            System.out.println("#" + test_case + " " + count);
		} // end
	}
}