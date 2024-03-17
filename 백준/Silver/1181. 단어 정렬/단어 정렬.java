import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String>[] word = new ArrayList[50];
        for (int i = 0; i < 50; i++) {
            word[i] = new ArrayList<String>();
        }

        for (int i = 0; i < n; i++) {
            String w = br.readLine();
            if (!word[w.length() - 1].contains(w))
                word[w.length() - 1].add(w);
        }

        for (int i = 0; i < 50; i++) {
            Collections.sort(word[i]);
            for (int j = 0; j < word[i].size(); j++) {
                bw.write(word[i].get(j) + "\n");
            }
        }


        bw.close();

    }
}