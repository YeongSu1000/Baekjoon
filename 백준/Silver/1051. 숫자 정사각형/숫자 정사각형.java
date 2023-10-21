import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int[][] rect = new int[y][x];
        String a;
        for (int i = 0; i < y; i++) {
            a = sc.next();
            for (int j = 0; j < x; j++) {
                rect[i][j] = Integer.parseInt(String.valueOf(a.charAt(j)));
            }
        }
        int yy = 0;
        int xx = 0;
        int rectSize = 1;
        while (yy != y - 1) {

            for (int i = xx + 1; i < x; i++) {
                int temp = rect[yy][xx];
                int ySize = yy + i - xx;
                if (rect[yy][i] == temp && yy + i - xx < y) { // x축에 같은 값이 있으면 , i-xx < y-yy
                    if (rect[yy + i - xx][xx] == temp && rect[yy + i - xx][i] == temp) { // 그 크기만큼 y축 내려가서 검사
                        if ((i - xx + 1) * (i - xx + 1) > rectSize) {
                            rectSize = (i - xx + 1) * (i - xx + 1);

                        }
                    }
                }
            }

            xx++;
            if (xx >= x - 1) {
                xx = 0;
                yy++;
            }

        }
        System.out.println(rectSize);


    }
}
