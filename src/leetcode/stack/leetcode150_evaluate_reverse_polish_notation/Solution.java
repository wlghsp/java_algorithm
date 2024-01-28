package leetcode.stack.leetcode150_evaluate_reverse_polish_notation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {

    /**
     * LeetCode problem: https://leetcode.com/problems/evaluate-reverse-polish-notation/
     * Time: O(N)
     * Space: O(N)
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        Set<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String t : tokens) {
            if (set.contains(t) && stk.size() >= 2) {
                int b = stk.pop();
                int a = stk.pop();
                int result = operate(t, a, b);
                stk.push(result);
            } else {
                stk.push(Integer.parseInt(t));
            }
        }
        return stk.pop();
    }


    public int operate(String op, int a, int b) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
