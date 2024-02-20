import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] schoolName = new String[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int consumption = 0;
            for (int j = 0; j < n; j++) {
                String school = sc.next();
                int c = sc.nextInt();
                if (c > consumption) {
                    consumption = c;
                    schoolName[i] = school;
                }
            }
        }
        for (int i = 0; i < schoolName.length ; i++) {
            System.out.println(schoolName[i]);
        }
    }
}
