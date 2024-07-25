import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String book;
        for (int i = 0; i < n; i++) {
            book = br.readLine();
            if (map.containsKey(book)) {
                map.replace(book, map.get(book) + 1);
            }else{
                map.put(book, 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }else{
                    return o2.getValue() - o1.getValue();
                }

            }
        });

        bw.write(list.get(0).getKey());
        bw.close();
    }
}