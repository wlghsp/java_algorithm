package baekjoon.bronze.bronze2.boj27160_할리갈리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());
            map.put(fruit, map.getOrDefault(fruit, 0) + cnt);
        }
        boolean result = false;
        for (String key : map.keySet()) {
            Integer cnt = map.get(key);
            if (cnt == 5) {
                result = true;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}
