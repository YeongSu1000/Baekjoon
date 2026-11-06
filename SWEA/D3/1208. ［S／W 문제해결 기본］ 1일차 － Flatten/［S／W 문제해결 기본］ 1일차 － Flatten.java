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
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) { // n번 덤프

                int min = 1000;
                int max = 0;
                int minIndex = 0;
                int maxIndex = 0;

                for (int j = 0; j < 100; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minIndex = j;
                    }
                    if (arr[j] > max) {
                        max = arr[j];
                        maxIndex = j;
                    }
                }

                if(arr[maxIndex] - arr[minIndex] == 0){
                    break;
                }
                arr[minIndex]++;
                arr[maxIndex]--;
            }
            
            int min = 1000;
            int max = 0;
            int minIndex = 0;
            int maxIndex = 0;
            
            for(int i = 0; i < 99; i++){
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
			System.out.print("#"+test_case+" ");
            System.out.println(arr[maxIndex] - arr[minIndex]);
        }
	}
}