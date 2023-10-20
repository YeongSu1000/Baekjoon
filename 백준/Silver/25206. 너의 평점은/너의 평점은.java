import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String strSubGrad, subName;
        double credit, subGrad = 0;
        double sum = 0;
        double creditSum = 0;
        for (int i = 0; i < 20; i++) {
            subName = sc.next();
            credit = sc.nextDouble();
            strSubGrad = sc.next();
            if (strSubGrad.charAt(0) == 'A'){
                if(strSubGrad.charAt(1)=='0'){
                    subGrad = 4.0;
                }else subGrad = 4.5;
            }else if (strSubGrad.charAt(0) == 'B'){
                if(strSubGrad.charAt(1)=='0'){
                    subGrad = 3.0;
                }else subGrad = 3.5;
            }else if (strSubGrad.charAt(0) == 'C'){
                if(strSubGrad.charAt(1)=='0'){
                    subGrad = 2.0;
                }else subGrad = 2.5;
            }else if (strSubGrad.charAt(0) == 'D'){
                if(strSubGrad.charAt(1)=='0'){
                    subGrad = 1.0;
                }else subGrad = 1.5;
            }else if (strSubGrad.charAt(0) == 'F'){
                subGrad = 0;
            }else if (strSubGrad.charAt(0) == 'P'){
                subGrad = 0;
                credit = 0;
            }
            sum += credit * subGrad;
            creditSum += credit;
        }
        double result = sum / creditSum;
        System.out.println(result);

    }
}
