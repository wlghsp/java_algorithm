package inflearn.q31_학급회장;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public char solution(int N, String s){

        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        char answer = ' ';
        int maxVal = Collections.max(map.values());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxVal) answer = entry.getKey();
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(N, s));

    }
}
