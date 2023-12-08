package programmers.level2.올바른괄호;


import java.util.Stack;

public class Solution {

    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stk.isEmpty()) {
                    return false;
                } else {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }

        return stk.isEmpty();
    }
}
