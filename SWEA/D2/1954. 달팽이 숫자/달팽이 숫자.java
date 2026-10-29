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
            int n = sc.nextInt(); // 달팽이 크기

            int[][] arr = new int[n][n]; // 달팽이 집

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1}; // 우 ,하 ,좌 ,상

            int end = n * n;

            int d = 0;

            int x = 0;
            int y = 0;

            for (int i = 1; i <= end; i++) {

                arr[x][y] = i; // 현재 좌표 찍기.

                // 다음 좌표 검증.
                if (x + dx[d] < 0 || x + dx[d] >= n || y + dy[d] < 0 || y + dy[d] >= n || arr[x + dx[d]][y + dy[d]] != 0) { // 인덱스 정상범위, 인덱스값이 0이 아님(방문하지 않음) 까지 방향 변경.
                    d = (d + 1) % 4;
                }
                x += dx[d];
                y += dy[d];
            }

            System.out.println("#" + test_case);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }       
        
		} // end
	}
}