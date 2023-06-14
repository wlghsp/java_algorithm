package programmers.코딩기초트레이닝.글자이어붙여문자열만들기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string, int[] index_list) {
        return Arrays.stream(index_list)
                .mapToObj(i -> String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})); // "programmers"
    }
}
