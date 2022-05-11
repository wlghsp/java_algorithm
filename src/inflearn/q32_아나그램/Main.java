package inflearn.q32_아나그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public HashMap<Character, Integer> counter(String w) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : w.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        return map;
    }

    public String solution(String w1, String w2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = counter(w1);
        HashMap<Character, Integer> map2 = counter(w2);

        for (char key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) return "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(T.solution(a, b));
    }
}
