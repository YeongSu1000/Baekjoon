import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> card = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            card.add(i);
        }

        while (card.size() > 1) {
            card.remove();
            if (card.size() == 1) {
                break;
            }
            card.add(card.element());
            card.remove();
        }
        bw.write(card.element() + "");

        bw.close();

    }
}