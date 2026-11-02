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
        	int size = 9;
        	int[][] arr = new int[size][size];
        	int result = 1;

        	for (int r = 0; r < size; r++) {
	            for (int c = 0; c < size; c++) {
	                arr[r][c] = sc.nextInt();
	            }
	        }

	        for (int r = 0; r < size; r++) { // r
	
            	int[] checkArr = new int[size + 1];

            	for (int c = 0; c < size; c++) {
	                checkArr[arr[r][c]]++;
	            }

            	for (int i = 1; i < size + 1; i++) {
	                if (checkArr[i] != 1) {
	                    result = 0;
	                }
    	        }
	        }

    	    if (result == 1) {
        	    for (int c = 0; c < size; c++) { // c

            	    int[] checkArr = new int[size + 1];

                	for (int r = 0; r < size; r++) {
                    	checkArr[arr[r][c]]++;
                	}

                	for (int i = 1; i < size + 1; i++) {
	                    if (checkArr[i] != 1) {
    	                    result = 0;
        	            }
            	    }

            	}
        	}

        	if (result == 1) { // 3*3
            	for (int rr = 0; rr < size; rr += 3) {
                	for (int cc = 0; cc < size; cc += 3) {

                    	int[] checkArr = new int[size + 1];
	
    	                for (int r = rr; r < rr + 3; r++) {
        	                for (int c = cc; c < cc + 3; c++) {
            	                checkArr[arr[r][c]]++;
                	        }
                    	}

                    	for (int i = 1; i < size + 1; i++) {
                        	if (checkArr[i] != 1) {
                            	result = 0;
                        	}	
                    	}

                	}
            	}
        	}

        	System.out.println("#" + test_case + " " + result);

		} // end
	}
}