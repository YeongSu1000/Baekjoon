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
            String str = sc.next();
            String madi = "";
            // 1. str(0)과 같은게 str(몇)에서 나오는지 확인.
            // 2. 같은거 나오면 str(1) 이랑 str(몇+1)도 맞는지 확인.

            for (int j = 1; j <= 10; j++) { // 마디 최대 길이 10으로 주어짐
                if (str.charAt(0) == str.charAt(j)) { // 0 ~ j - 1 -> 첫 번째 마디. 마디 길이 = j
                    boolean same = true;
                    for (int k = 1; k < j; k++) { // 0 < k < j - 1 , j < k + j < 2j
                        if (str.charAt(k) != str.charAt(k + j)) { // if문 전체가 true면 마디임
                            same = false;
                        }
                    }
                    if (same) {
                        madi = str.substring(0, j);

                        for (int k = j * 2; k < str.length(); k++) {
                            if (str.charAt(k) != madi.charAt(k % j)) {
                                same = false;
                                break;
                            }
                        }

                        if (same) {
                            break;
                        }
                    }

                }
            }

            System.out.println("#" + test_case + " " + madi.length());

		}
	}
}