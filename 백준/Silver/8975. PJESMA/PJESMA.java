import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        bw.close();
    }

    static int n;
    static int m;
    static String[] name;
    static String[] arr;

    static void input() throws IOException {

        n = Integer.parseInt(br.readLine());
        name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = br.readLine();
        }

        m = Integer.parseInt(br.readLine());
        arr = new String[m];
        for (int i = 0; i < m; i++) {
            arr[i] = br.readLine();
        }

        if (n % 2 == 0) {
            bw.write(test(n / 2) + "");
        } else {
            bw.write(test(n / 2 + 1) + "");
        }

    }


    static int test(int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += search(arr[i]);
            if(count == c){
                return i + 1;
            }
        }
        return count;
    }

    static int search(String s){
        for (int i = 0; i < name.length; i++) {
            if(name[i].equals(s)){
                name[i] = "";
                return 1;
            }
        }
        return 0;
    }
}