package programmers.코딩기초트레이닝.코드처리하기;

import org.junit.platform.commons.util.StringUtils;

public class Solution {

    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
            } else {
                if(mode == 0) {
                    if(i % 2 == 0) {
                        answer.append(c);
                    }
                } else {
                    if (i % 2 != 0) {
                        answer.append(c);
                    }
                }
            }
        }
        return (answer.length() == 0) ? "EMPTY" : answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abc1abc1abc")); // "acbac"
    }
}
