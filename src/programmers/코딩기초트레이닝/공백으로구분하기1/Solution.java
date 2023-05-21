package programmers.코딩기초트레이닝.공백으로구분하기1;

import java.util.Arrays;

public class Solution {

    public String[] solution(String my_string) {
        return  my_string.split(" ");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string1 = "i love you";
        String my_string2 = "programmers";
        System.out.println(Arrays.toString(s.solution(my_string1)));
        System.out.println(Arrays.toString(s.solution(my_string2)));

    }
}
