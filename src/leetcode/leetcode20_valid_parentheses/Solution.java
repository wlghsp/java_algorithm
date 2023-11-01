package leetcode.leetcode20_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stk = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) { // 여는 괄호
                stk.push(c);
            } else if (bracketMap.containsKey(c)) { // 닫는 괄호
                if (stk.isEmpty() || stk.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}
