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
    
            int[][] arr2 = new int[n][n];
            int[][] arr3 = new int[n][n];
            int[][] arr4 = new int[n][n];
            // n*n 행렬 -> 시계방향으로 90 ,180, 270회전
    
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }
    
            // 90 회전
            for (int cc = 0, r = 0; cc < n; cc++, r++) {
                for (int rr = n - 1, c = 0; rr >= 0; rr--, c++) {
                    arr2[r][c] = arr[rr][cc];
                }
            }
            //180
            for (int cc = 0, r = 0; cc < n; cc++, r++) {
                for (int rr = n - 1, c = 0; rr >= 0; rr--, c++) {
                    arr3[r][c] = arr2[rr][cc];
                }
            }
            // 270
            for (int cc = 0, r = 0; cc < n; cc++, r++) {
                for (int rr = n - 1, c = 0; rr >= 0; rr--, c++) {
                    arr4[r][c] = arr3[rr][cc];
                }
            }
    
            System.out.println("#" + test_case);
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(arr2[r][c]);
                }
                System.out.print(" ");
                for (int c = 0; c < n; c++) {
                    System.out.print(arr3[r][c]);
                }
                System.out.print(" ");
                for (int c = 0; c < n; c++) {
                    System.out.print(arr4[r][c]);
                }
                System.out.println();
            }
            
		}// end
	}
}