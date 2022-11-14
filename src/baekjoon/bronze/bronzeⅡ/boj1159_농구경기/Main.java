package baekjoon.bronze.bronzeⅡ.boj1159_농구경기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";
        boolean found = false;
        if (N < 5) System.out.println("PREDAJA");
        else {
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0) + 1);
            }
            for (Map.Entry<Character, Integer> en : map.entrySet()) {
                if (en.getValue() >= 5) {
                    found = true;
                    result += en.getKey();
                }
            }
            if (found) System.out.println(result);
            else System.out.println("PREDAJA");
        }

    }
}
