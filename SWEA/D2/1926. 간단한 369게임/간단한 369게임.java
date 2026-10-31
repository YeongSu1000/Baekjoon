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
        	// i%10 계산
            // 나머지가 3,6,9일 경우 i - 1의 값 ++
            // i가 1보다 크면, i /= 10. 이후 반복
            
            num = i;

            while(num >= 1){
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9){
            		arr[i-1]++;
            	}
                num /= 10;
            }
            
        } // end for
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){ // 3,6,9가 0개면
            	System.out.print(i + 1 + " ");
            }else{
                for(int j = 0; j < arr[i]; j++){ // 3,6,9, 갯수만큼 - 반복
                	System.out.print("-");
                }
                System.out.print(" ");
            }
        }
            
	}
}