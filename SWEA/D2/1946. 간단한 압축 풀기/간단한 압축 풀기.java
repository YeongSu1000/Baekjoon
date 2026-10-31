
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
            System.out.println("#" + test_case);
			int n = sc.nextInt();
            int index = 1;
            for(int i = 0; i < n; i++){
             	char Ci = sc.next().charAt(0);
                int Ki = sc.nextInt();
                
                // Ci 를 Ki번 출력
                // index를 이용해서 한 줄에 10개까지만. 그 이상은 다음줄로.
                for(int j = 0; j < Ki; j++){
                	System.out.print(Ci);
                    index++;
                    if(index >10)
                    {
                        System.out.println();
                        index = 1;
                    }
                }
            }
            System.out.println();
		}// end
	}
}