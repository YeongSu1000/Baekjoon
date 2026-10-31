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
            double[]score = new double[n];
            
            for(int i = 0; i < n; i++){
                score[i] = sc.nextInt() * 0.35 + sc.nextInt() * 0.45 + sc.nextInt() * 0.2;
            }
            
            int count =0;
            for(int i = 0; i < n; i++){
            	if(score[i] > score[k - 1]){
                	count++;
                }
            }
            
            // while문 간소화
            int grade = count / (n / 10);
            
            System.out.print("#" + test_case + " ");

            // Switch문 간소화
            String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
			System.out.println(grades[grade]);
            
		} // end
	}
}