import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] book = new int[n];
        int box = 0;
        int boxNum = 1;
        for (int i = 0; i < book.length; i++) {
            book[i] = sc.nextInt();
        }
        if(n == 0){
            boxNum = 0;
        }

        for (int i = 0; i < book.length; i++) {
            if (book[i] + box <= m){
                box = book[i] + box;
            }else{
                boxNum++;
                box = book[i];
            }
        }
        System.out.println(boxNum);
    }
}
