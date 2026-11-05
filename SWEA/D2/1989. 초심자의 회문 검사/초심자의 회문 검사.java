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
                        String s = sc.next();
            char[] c = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                c[i] = s.charAt(s.length() - 1 - i);
            }
            String s2 = new String(c);

            if(s.equals(s2)){
                System.out.println("#" + test_case + " " + "1");
            }else{
                System.out.println("#" + test_case + " " + "0");
            }
		}
	}
}