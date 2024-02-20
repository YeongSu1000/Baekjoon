import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chairman = "ZZZ";
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (name.length() == 3){
                if (chairman.charAt(0) == name.charAt(0)){
                    if (chairman.charAt(1) == name.charAt(1)){
                        if (chairman.charAt(2) > name.charAt(2)){
                            chairman = name;
                        }
                    }else if((chairman.charAt(1) >= name.charAt(1))){
                        chairman = name;
                    }
                }else if ((chairman.charAt(0) >= name.charAt(0))){
                    chairman = name;
                }
            }
        }
        System.out.println(chairman);
    }
}
