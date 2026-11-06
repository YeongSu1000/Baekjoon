import java.util.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt(); // 덤프횟수
            int[] arr = new int[102];
            for (int i = 0; i < 100; i++) {
                arr[sc.nextInt()]++;
            }
    
            for (int i = 0; i < n; i++) { // n번 덤프
                
                int min = 0;
                int max = 100;
                for (int j = 1; j <= 100; j++) {
                    if (arr[j] > 0) {
                        min = j;
                        break;
                    }
                }
                for (int j = 100; j >= 1; j--) {
                    if (arr[j] > 0) {
                        max = j;
                        break;
                    }
                }
                if (max - min <= 1) {
                    break;
                }
                
                for (int j = 1; j <= 100; j++) {
                    if (arr[j] > 0) {
                        arr[j]--;
                        arr[j + 1]++;
                        break;
                    }
                }
                for (int j = 100; j >= 1; j--) {
                    if (arr[j] > 0) {
                        arr[j]--;
                        arr[j - 1]++;
                        break;
                    }
                }
    
            }
    
            int min = 0;
            int max = 100;
            for (int i = 1; i <= 100 ; i++) {
                if (arr[i] > 0) {
                    min = i;
                    break;
                }
            }
            for (int i = 100; i >= 1 ; i--) {
                if (arr[i] > 0) {
                    max = i;
                    break;
                }
            }
            System.out.print("#" + test_case + " ");
            System.out.println(max - min);
        }
	}
}