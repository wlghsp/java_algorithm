package programmers.코딩기초트레이닝.접미사인지확인하기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int solution1(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
          list.add(my_string.substring(i));
        }
        return new HashSet<>(list).contains(is_suffix) ? 1 : 0;
    }

    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("banana", "ana")); // 1
        System.out.println(s.solution("banana", "nan")); // 0
        System.out.println(s.solution("banana", "wxyz")); // 0
        System.out.println(s.solution("banana", "abanana")); // 0
    }
}
