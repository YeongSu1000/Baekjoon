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
            int n = sc.nextInt();
			boolean[] checkNum = new boolean[10];
            boolean check = false;
    
            int num = n;
    
            while (!check) {
    
                int temp = num;
                while (temp > 0) { // 현재 본 숫자 추가
                    checkNum[temp % 10] = true;
                    temp /= 10;
                }
    
                for (int i = 0; i < checkNum.length; i++) { // 모든 숫자 봤는지
                    check = true;
                    if (!checkNum[i]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    break;
                }
                num += n;
            }
    
            System.out.println("#" + test_case + " " + num);
		}
	}
}