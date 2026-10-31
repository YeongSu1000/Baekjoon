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
			// N명 // K번째
            // 중간35 기말45 과제20
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            double[]score = new double[n];
            
            for(int i = 0; i < n; i++){
                score[i] = sc.nextInt() * 0.35 + sc.nextInt() * 0.45 + sc.nextInt() * 0.2;
            }
            
            // k번 학생이 몇번째 등수에 속하는지.
            // k번 학생보다 높은 점수 세기.
            int scoreCount =0;
            for(int i = 0; i < n; i++){
            	if(score[i] > score[k - 1]){
                	scoreCount++;
                }
            }
            
            // 학점 구하기 
            // count+1 이 나올 때 까지 n / 10 더함.
            // 더한 횟수 = 학점. // 1 = A+, 2 = A0 ...
            int temp = 0;
            int count =0;
            while(temp < scoreCount + 1){
            	temp += n / 10;
                count++;
            }
            System.out.print("#" + test_case + " ");
            switch(count){
                case 1:
                System.out.println("A+");
                break;
                case 2:
                System.out.println("A0");
                break;
                case 3:
                System.out.println("A-");
                break;
                case 4:
                System.out.println("B+");
                break;
                case 5:
                System.out.println("B0");
                break;
                case 6:
                System.out.println("B-");
                break;
                case 7:
                System.out.println("C+");
                break;
                case 8:
                System.out.println("C0");
                break;
                case 9:
                System.out.println("C-");
                break;
                case 10:
                System.out.println("D0");
                break;
            }
            
            
            
		} // end
	}
}