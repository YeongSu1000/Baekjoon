import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int t = sc.nextInt();            
            int [][]arr = new int[100][100];
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
    
            int max = 0;
            int sum = 0;
            int sum2 = 0;
            for (int i = 0; i < 100; i++) {
                int rSum = 0;
                int cSum = 0;
                for (int j = 0; j < 100; j++) {
                    rSum += arr[i][j];
                    cSum += arr[j][i];
                }
                if(rSum > max){
                    max = rSum;
                }
                if(cSum > max){
                    max = cSum;
                }
                sum += arr[i][i];
                sum2 += arr[i][99-i];
            }
            if(sum > max){
                max = sum;
            }
            if(sum2 > max){
                max = sum2;
            }
            System.out.println("#" + test_case + " " + max);
		}
	}
}