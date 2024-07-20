package baekjoon.silver.silver5.boj27964_콰트로치즈피자;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj27964_콰트로치즈피자/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            String topping = st.nextToken();
            if (!topping.endsWith("Cheese")) continue;
            map.put(topping, map.getOrDefault(topping, 0) + 1);
        }

        int cnt = map.keySet().size();

        System.out.println(cnt >= 4 ? "yummy" : "sad");
    }
}
