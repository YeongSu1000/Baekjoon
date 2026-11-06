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
            int[][] arr = new int[n][n];

            for (int r = 0; r < n; r++) {
                String num = sc.next();
                for (int c = 0; c < n; c++) {
                    arr[r][c] = num.charAt(c)-'0';
                }
            }


            int sum = 0;
            for (int r = 0; r < n / 2; r++) {
                for (int c = n / 2 - r; c <= n / 2 + r; c++) {
                    sum += arr[r][c];
                }
            }
            for (int c = 0; c < n; c++) {
                sum += arr[n / 2][c];
            }

            for (int r = n / 2 + 1, i = 1; r < n; r++, i++) {
                for (int c = i; c < n - i; c++) {
                    sum += arr[r][c];
                }
            }
            System.out.print("#" + test_case + " ");
            System.out.println(sum);
        }
	}
}