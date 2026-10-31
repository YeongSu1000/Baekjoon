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
        	int m = sc.nextInt();
        	int[][] arr = new int[n][n];

        	for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        int[][] sum = new int[n + 1][n + 1]; // 누적합 배열
    	    for (int i = 1; i < n + 1; i++) {
        	    for (int j = 1; j < n + 1; j++) {
            	    sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i - 1][j - 1];
            	}	
        	}

        	// m * m 사이즈 탐색
        	int max = 0;
        	int num = 0;
        	for (int i = m; i < n + 1; i++) {
	            for (int j = m; j < n + 1; j++) {
	                num = sum[i][j] - sum[i - m][j] - sum[i][j - m] + sum[i - m][j - m];
	                if (num > max) {
	                    max = num;
	                }
	            }
	        }

        	System.out.println("#" + test_case + " " + max);
		} // end 
	}
}