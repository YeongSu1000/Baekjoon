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
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
    
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }
    
            int count = 0;
            int size;
            // 불필요한 변수제거, 알고리즘 간결성 개선
            // r
            for (int r = 0; r < n; r++) {
                size = 0;
                for (int c = 0; c < n; c++) {
    
                    if (arr[r][c] == 1) {
                        size++;
                    }
    
                    if (arr[r][c] == 0) {
                        if (size == k) {
                            count++;
                        }
                        size = 0;
                    }
                }
    
                if (size == k) { // 1로 끝났을 경우 추가 검사
                    count++;
                }
            }
    
    
            // c
            for (int c = 0; c < n; c++) {
                size = 0;
                for (int r = 0; r < n; r++) {
    
                    if (arr[r][c] == 1) {
                        size++;
                    }
    
                    if (arr[r][c] == 0) {
                        if (size == k) {
                            count++;
                        }
                        size = 0;
                    }
                }
    
                if (size == k) {
                    count++;
                }
            }
            System.out.println("#" + test_case + " " + count);
		}
	}
}