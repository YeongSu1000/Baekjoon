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
    
            int speed = 0;
            int distance = 0;
    
            for (int i = 0; i < n; i++) {
                int command = sc.nextInt();
    
                // command
                // 0 - 속도만큼 이동거리 추가
                // 1 - 속도+ 이동거리+
                // 2 - 속도- 이동거리+
    
                switch(command){
                    case 0:
                        distance += speed;
                        break;
                    case 1:
                        speed += sc.nextInt();
                        distance += speed;
                        break;
                    case 2:
                        speed -= sc.nextInt();
                        if(speed < 0) speed = 0; // 감속할 속도가 더 큰경우 0이 됨
                        distance += speed;
                        break;
                }
            }
    
            System.out.println("#" + test_case + " " + distance);
		}
	}
}