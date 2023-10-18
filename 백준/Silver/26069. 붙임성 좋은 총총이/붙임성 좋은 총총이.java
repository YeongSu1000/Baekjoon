import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chong = "ChongChong";
        String a,b;
        HashSet<String> name = new HashSet<String>();
        name.add(chong);
        while(n-->0){
            a = sc.next();
            b = sc.next();
            if(name.contains(a) || name.contains(b)){
                name.add(a);
                name.add(b);
            }

        }
        System.out.println(name.size());
    }
}