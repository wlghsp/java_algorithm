package cs_senpai.boj1302_베스트셀러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0)+ 1);
        }

        int max_val = Integer.MIN_VALUE;
//        Iterator<String> keys = map.keySet().iterator();
//        while (keys.hasNext()) {
//            String key = keys.next();
//            if (map.get(key) > max_val){
//                max_val = map.get(key);
//            }
//        }
        for (String k : map.keySet()) {
            max_val = Math.max(max_val, map.get(k));
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

//        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
//        while(entries.hasNext()){
//            Map.Entry<String, Integer> entry = entries.next();
//            if (entry.getValue() == max_val) {
//                list.add(entry.getKey());
//            }
//        }

        Collections.sort(list);
        for (String s : list) {
            if (map.get(s) == max_val) {
                System.out.println(s);
                break;
            }
        }
    }
}
