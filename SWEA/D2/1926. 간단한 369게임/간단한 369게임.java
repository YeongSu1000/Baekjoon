import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
        
        int[] arr = new int[n]; //값 = 3,6,9의 갯수
        
        int num = 0;
        for(int i = 1; i < n + 1; i++){
            
            num = i;

            while(num >= 1){
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9){
            		arr[i-1]++;
            	}
                num /= 10;
            }
            
			if (arr[i - 1] == 0) { // 출력 로직 위치 변경
                System.out.print(i + " ");
            } else {
                for (int j = 0; j < arr[i - 1]; j++) { 
                    System.out.print("-");
                }
                System.out.print(" ");
            }

        } // end for
            
	}
}