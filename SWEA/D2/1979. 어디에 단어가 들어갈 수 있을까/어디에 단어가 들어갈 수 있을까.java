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
            int size = 0;
            boolean find = false;
    
            // r
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
    
                    if (arr[r][c] == 1) { // 1이 나옴
                        if (find == true) { // 전에도 1이었던 경우
                            size++;
                        } else if (find == false) { // 처음 나온경우
                            find = true;
                            size++;
                        }
                    }
    
    
                    if (arr[r][c] == 0) { // 0이 나옴
                        if (find == true) { // 1 다음 나온 0 경우
                            find = false;
                            if (size == k) {
                                count++;
                            }
                            size = 0;
                        }
                    }
    
                    if (c == n - 1 && arr[r][c] == 1) { // 마지막 인덱스가 1일경우
                        find = false;
                        if(size == k){
                            count++;
                        }
                        size = 0;
                    }
    
                }
            }
    
            // c
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < n; r++) {
    
                    if (arr[r][c] == 1) {
                        if (find == true) {
                            size++;
                        } else if (find == false) {
                            find = true;
                            size++;
                        }
                    }
    
                    if (arr[r][c] == 0) {
                        if (find == true) {
                            find = false;
                            if (size == k) {
                                count++;
                            }
                            size = 0;
                        }
                    }
    
                    if (r == n - 1 && arr[r][c] == 1) {
                        find = false;
                        if(size == k){
                            count++;
                        }
                        size = 0;
                    }
    
                }
            }
    
            System.out.println("#" + test_case + " " + count);
		}
	}
}