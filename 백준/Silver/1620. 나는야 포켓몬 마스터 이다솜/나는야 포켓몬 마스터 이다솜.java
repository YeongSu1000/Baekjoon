import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] pokemon = new String[n + 1];
        pokemon[0] = "";
        for (int i = 1; i <= n; i++) {
            pokemon[i] = br.readLine();
            map.put(pokemon[i], i);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(map.containsKey(s)){
                bw.write(map.get(s)+"\n");
            }else bw.write(pokemon[Integer.parseInt(s)]+"\n");
        }


        bw.close();

    }
}