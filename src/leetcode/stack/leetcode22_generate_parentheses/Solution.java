package leetcode.stack.leetcode22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    List<String> answer = new ArrayList<>();
    Stack<String> stk = new Stack<>();


    public List<String> generateParenthesis(int n) {
        backTrack(0, 0, n);
        return answer;
    }

    private void backTrack(int openCnt, int closeCnt, int n) {
        if (openCnt == closeCnt && closeCnt == n) {
            answer.add(String.join("", stk));
        }
        if (openCnt < n) {
            stk.push("(");
            backTrack(openCnt + 1, closeCnt, n);
            stk.pop();
        }
        if (closeCnt < openCnt) {
            stk.push(")");
            backTrack(openCnt, closeCnt + 1, n);
            stk.pop();
        }
    }

}
