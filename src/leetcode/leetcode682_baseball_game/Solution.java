package leetcode.leetcode682_baseball_game;


import java.util.Stack;

public class Solution {

    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();

        for (String s : operations) {
            switch (s) {
                case "+" -> {
                    int n1 = stk.pop();
                    int n2 = stk.peek();
                    stk.push(n1);
                    stk.push(n1 + n2);
                }
                case "D" -> {
                    stk.push(stk.peek() * 2);
                }
                case "C" -> {
                    stk.pop();
                }
                case null, default -> stk.push(Integer.parseInt(s));
            }
        }

        for (Integer s : stk) {
            ans += s;
        }

        return ans;
    }
}
