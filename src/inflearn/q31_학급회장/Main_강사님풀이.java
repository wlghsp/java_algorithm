package inflearn.q31_학급회장;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_강사님풀이 {

    public char solution(int N, String s){
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_강사님풀이 T = new Main_강사님풀이();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        System.out.println(T.solution(N, s));

    }
}
