package programmers.코딩기초트레이닝.세개의구분자;

import java.util.Arrays;

public class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.replace("a", "@").replace("b", "@").replace("c", "@").split("@");
        return split.length > 0 ? Arrays.stream(split).filter(s -> !s.isEmpty()).toArray(String[]::new) : new String[]{"EMPTY"};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(Arrays.toString(s.solution("baconlettucetomato"))); // ["onlettu", "etom", "to"]
        System.out.println(Arrays.toString(s.solution("cabab"))); // 	["EMPTY"]
    }
}
