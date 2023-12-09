package programmers.level2.짝지어제거하기;


import java.util.Stack;

public class Solution {

    public int solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (char c :s.toCharArray()){
            if (!stk.isEmpty() && stk.peek() == c) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }

        return stk.isEmpty() ? 1 : 0;
    }

}
