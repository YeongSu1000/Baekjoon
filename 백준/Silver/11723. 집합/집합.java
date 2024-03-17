import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void writer(int x) throws IOException {

        if (x == 0 || x == 1) {
            bw.write(x + "\n");
        }else bw.flush();

    }

    public static void add(int x, ArrayList<Integer> s) {
        if (!s.contains(x)) {
            s.add(x);
        }
    }

    public static void remove(int x, ArrayList<Integer> s) {
        if (s.contains(x)) {
            s.remove(Integer.valueOf(x));
        }
    }

    public static int check(int x, ArrayList<Integer> s) {
        if (s.contains(x)) {
            return 1;
        } else return 0;

    }

    public static void toggle(int x, ArrayList<Integer> s) {
        if (s.contains(x)) {
            s.remove(Integer.valueOf(x));
        } else s.add(x);
    }

    public static void all(ArrayList<Integer> s) {
        s.clear();
        for (int i = 1; i <= 20; i++) {
            s.add(i);
        }
    }

    public static void empty(ArrayList<Integer> s) {
        s.clear();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> s = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String menu = st.nextToken();
            if (menu.equals("add")) {
                add(Integer.parseInt(st.nextToken()), s);
            } else if (menu.equals("remove")) {
                remove(Integer.parseInt(st.nextToken()), s);
            } else if (menu.equals("check")) {
                writer(check(Integer.parseInt(st.nextToken()), s));
            } else if (menu.equals("toggle")) {
                toggle(Integer.parseInt(st.nextToken()), s);
            } else if (menu.equals("all")) {
                all(s);
            } else if (menu.equals("empty")) {
                empty(s);
            }
        }

        writer(-1);

    }
}