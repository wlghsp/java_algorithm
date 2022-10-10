package programmers.level0.잘라서배열로저장하기;

import java.util.Arrays;

public class Solution {

    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length()/ n : my_str.length()/ n + 1;
        String[] answer = new String[len];
        for (int i = 0; i < len; i++) {
            String str = "";
            for (int j = n * i; j < Math.min(n * (i + 1), my_str.length()); j++) {
                str += my_str.charAt(j);
            }
            answer[i] = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("abc1Addfggg4556b", 6))); //	["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(s.solution("abcdef123", 3)));        //	["abc", "def", "123"]

    }
}
