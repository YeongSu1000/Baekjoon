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
            int a = 0, b = 0, c = 0, d = 0, e = 0;
            while (n % 11 == 0) {
                n /= 11;
                e++;
            }
            while (n % 7 == 0) {
                n /= 7;
                d++;
            }
            while (n % 5 == 0) {
                n /= 5;
                c++;
            }
            while (n % 3 == 0) {
                n /= 3;
                b++;
            }
            while (n % 2 == 0) {
                n /= 2;
                a++;
            }
            System.out.print("#" + test_case +" ");
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);		

		}
	}
}