package leetcode.leetcode22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        generateParenthesisHelper(n, n, "", answer);
        return answer;
    }

    private void generateParenthesisHelper(int openCnt, int closeCnt, String current, List<String> answer) {
        if (openCnt == 0 && closeCnt == 0) {
            answer.add(current);
            return;
        }

        if (openCnt > 0) {
            generateParenthesisHelper(openCnt - 1, closeCnt, current + "(", answer);
        }

        if (closeCnt > openCnt) {
            generateParenthesisHelper(openCnt, closeCnt - 1, current + ")", answer);
        }
    }

}
