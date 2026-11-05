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
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();
            
            int CostA = p * w;
            int CostB;
    
            if(w > r){
                CostB = (w - r) * s + q;
            }else{
                CostB = q;
            }
    
            if(CostA < CostB){
                System.out.println("#"+test_case+" "+CostA);
            }else System.out.println("#"+test_case+" "+CostB);
            
		} // end
	}
}