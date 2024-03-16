package leetcode.stack.leetcode394_decode_string;

import java.util.Stack;

public class Solution {

    public String decodeString(String s) {
        Stack<String> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stk.add(String.valueOf(s.charAt(i)));
            } else {
                StringBuilder subStr = new StringBuilder();
                // 닫히는 괄호 만날 때 까지
                while (!stk.peek().equals("[")) {
                    subStr.insert(0, stk.pop());
                }
                // 닫히는 괄호를 빼낸다.
                stk.pop();

                // 숫자 만들기
                StringBuilder k = new StringBuilder();
                while (!stk.isEmpty() && stk.peek().chars().allMatch(Character::isDigit)) {
                    k.insert(0, stk.pop());
                }

                // 숫자 * 문자로 만들어서 stk에 삽입
                stk.add(subStr.toString().repeat(Integer.parseInt(k.toString())));
            }
        }

        return String.join("", stk);
    }
}
