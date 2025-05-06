package real_tests.kkne_250506;

import java.util.*;

public class Kkne4 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && c != stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        Kkne4 k = new Kkne4();
        int res1 = k.solution("1011");
        int res2 = k.solution("0110011");
        int res3 = k.solution("000111");
        System.out.println(res1); // 2
        System.out.println(res2); // 1
        System.out.println(res3); // 0
    }
}
