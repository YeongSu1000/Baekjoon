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
            // 50000 10000 5000 1000 500 100 50 10
            
            System.out.println("#" + test_case);
            
            System.out.print(n / 50000 + " ");
            n %= 50000;
			System.out.print(n / 10000 + " ");
            n %= 10000;
          	System.out.print(n / 5000 + " ");
            n %= 5000;
            System.out.print(n / 1000 + " ");
            n %= 1000;
            System.out.print(n / 500 + " ");
            n %= 500;
            System.out.print(n / 100 + " ");
            n %= 100;
            System.out.print(n / 50 + " ");
            n %= 50;
            System.out.println(n / 10 + " ");
		}// end
	}
}