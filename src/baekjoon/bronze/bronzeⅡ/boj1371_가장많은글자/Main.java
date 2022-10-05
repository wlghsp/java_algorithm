package baekjoon.bronze.bronzeⅡ.boj1371_가장많은글자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> charMap = new HashMap<>();

        for (Character c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            charMap.put(c, 0);
        }

        StringBuilder str = new StringBuilder();
        String input;
        while ((input = br.readLine()) != null) {
            str.append(input);
        }

        for (Character c : str.toString().toCharArray()) {
            if (charMap.containsKey(c)) charMap.put(c, charMap.get(c) + 1);
        }
        Integer maxValue = Collections.max(charMap.values());
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            // Objects equals 객체를 비교해주는 메소드.
            if (Objects.equals(entry.getValue(), maxValue)) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        for (Character c : list) {
            System.out.print(c);
        }
    }
}
