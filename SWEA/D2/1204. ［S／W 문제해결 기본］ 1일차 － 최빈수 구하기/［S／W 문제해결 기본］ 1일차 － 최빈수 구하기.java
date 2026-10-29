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
            int testCaseNum = sc.nextInt();
            
            int maxNum = 0;
            int maxCount = 0;
            
            int score = 0;
			int[] count = new int[101];
            
            for(int i = 0; i < 1000; i++){ // 해당 점수가 몇 번 나왔는지 카운트
                score = sc.nextInt();
                count[score]++;
            }
            
            for(int i = 0; i < count.length; i++){ // 가장 많이 카운트 된 점수 찾기.
            	if(count[i] >= maxCount){
                	maxCount = count[i];
                    maxNum = i;
                }
            }
            
            System.out.println("#" + testCaseNum + " " + maxNum);
                        
		} // end
	}
}