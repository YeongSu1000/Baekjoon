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
        int[][] temp = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < size; r++) { // 행과 열 한번에 검증
            for (int c = 0; c < size; c++) {
                temp[r][arr[r][c] - 1]++;
                temp[arr[r][c] - 1][c]++;
            }
        }

        for (int r = 2,i = 0; r < size; r += 3) { // 3 * 3 영역 순회
            for (int c = 2; c < size; c += 3, i++) {

                for (int rr = r - 2; rr <= r; rr++) {
                    for (int cc = c - 2; cc <= c; cc++) {
                        temp[i][arr[rr][cc] -1]++;
                    }
                }

            }
        }

        int result = 1;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if(temp[r][c] != 3) {
                    result = 0;
                }
            }
        }
        System.out.println("#" + test_case + " " +result);
		} // end
	}
}