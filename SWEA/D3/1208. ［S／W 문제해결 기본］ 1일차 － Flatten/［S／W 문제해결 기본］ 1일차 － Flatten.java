import java.util.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt(); // 덤프횟수
            int []arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for (int i = 0; i < n; i++) { // n번 덤프
                if(arr[99] - arr[0] == 0){
                    break;
                }
                arr[99]--;
                arr[0]++;
                Arrays.sort(arr);

            }
			System.out.print("#"+test_case+" ");
            System.out.println(arr[99] - arr[0]);
        }
	}
}