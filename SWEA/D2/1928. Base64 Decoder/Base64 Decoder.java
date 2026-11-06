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
            String encoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
            String decoding = "";
            String str = sc.next();
    
            for (int i = 0; i < str.length(); i++) {
                String binary = Integer.toBinaryString(encoding.indexOf(str.charAt(i))); // 2진수로 변경
                switch (binary.length()) {
                    case 1:
                        binary = "00000" + binary;
                        break;
                    case 2:
                        binary = "0000" + binary;
                        break;
                    case 3:
                        binary = "000" + binary;
                        break;
                    case 4:
                        binary = "00" + binary;
                        break;
                    case 5:
                        binary = "0" + binary;
                        break;
                }
                decoding += binary; // 6비트씩 저장
            }
    
            // 8비트씩 읽어오기
            System.out.print("#" + test_case + " ");
            for (int i = 0; i < decoding.length() / 8; i++) {
                String bit8 = "";
                for (int j = i * 8; j < i * 8 + 8; j++) {
                    bit8 += decoding.charAt(j);
                }
                System.out.print((char)Integer.parseInt(bit8, 2)); // 8비트 문자로 변환 출력
            }
            System.out.println();
		}
	}
}