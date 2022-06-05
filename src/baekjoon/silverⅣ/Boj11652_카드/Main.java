package baekjoon.silverⅣ.Boj11652_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Long> hm = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            hm.put(num, hm.getOrDefault(num, Long.valueOf(0))+1);
        }
        List<Map.Entry<Long, Long>> list_entries = new ArrayList<>(hm.entrySet());
        Collections.sort(list_entries, (o1, o2) -> {
            if (o2.getValue().compareTo(o1.getValue()) == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue().compareTo(o1.getValue());
        });

        System.out.println(list_entries.get(0).getKey());

    }
}
