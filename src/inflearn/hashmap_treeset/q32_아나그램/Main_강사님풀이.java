package inflearn.hashmap_treeset.q32_아나그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_강사님풀이 {

    public String solution(String w1, String w2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : w1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char c : w2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main_강사님풀이 T = new Main_강사님풀이();
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(T.solution(a, b));
    }
}
