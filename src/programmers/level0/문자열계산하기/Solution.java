package programmers.level0.문자열계산하기;

import java.util.StringTokenizer;

public class Solution {

    public int solution(String my_string) {
        boolean isMinus = false;
        int answer = 0;
        String[] exp = my_string.split(" ");
        for (String s : exp) {
            if ("+".equals(s)) {
                isMinus = false;
            } else if ("-".equals(s)) {
                isMinus = true;
            } else {
                if (isMinus) {
                    answer -= Integer.parseInt(s);
                } else {
                    answer += Integer.parseInt(s);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3 + 4")); // 7
    }
}
