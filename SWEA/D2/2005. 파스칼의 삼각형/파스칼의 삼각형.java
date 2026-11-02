import java.io.*;
import java.util.*;
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
            int[] arr = new int[n];
            arr[0] = 1;
    
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1] + arr[j];
                }
                for (int j = 0; j <= i; j++) { // j+1 번째 줄 출력
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            
		}// end
	}
}