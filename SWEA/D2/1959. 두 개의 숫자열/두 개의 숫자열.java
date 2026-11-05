import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{	Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int m = sc.nextInt();
    
            int[] a;
            int[] b;
            if (n <= m) {
                a = new int[n];
                b = new int[m];
                for (int i = 0; i < a.length; i++) {
                    a[i] = sc.nextInt();
    
                }
                for (int i = 0; i < b.length; i++) {
                    b[i] = sc.nextInt();
                }
            } else {
                a = new int[m];
                b = new int[n];
                for (int i = 0; i < b.length; i++) {
                    b[i] = sc.nextInt();
    
                }
                for (int i = 0; i < a.length; i++) {
                    a[i] = sc.nextInt();
                }
            }
    
            int max = 0;
            for (int i = 0; i < b.length - a.length + 1; i++) {
                int sum = 0;
                for (int j = 0; j < a.length; j++) {
                    sum += a[j] * b[j + i];
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println("#" + test_case + " " +max);
		} // end
	}
}