package baekjoon.silverⅢ.Boj9375_패션왕신혜빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String[] wear = br.readLine().split(" ");
                map.put(wear[1], map.getOrDefault(wear[1], 0) + 1);
            }

            int answer = 1;
            for (String s : map.keySet()) {
                answer *= (map.get(s) + 1); // 그 종류의 의상을 착용안한 경우
            }
            System.out.println(answer - 1); // 모든 의상을 착용하지 않은 경우를 뺀다.
        }
   }
}
