package baekjoon.bronze.bronzeⅢ.boj20540_연길이의이상형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('E', 'I');
        map.put('I', 'E');
        map.put('S', 'N');
        map.put('N', 'S');
        map.put('T', 'F');
        map.put('F', 'T');
        map.put('J', 'P');
        map.put('P', 'J');
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(map.get(c));
        }
        System.out.println(sb);

    }
}
