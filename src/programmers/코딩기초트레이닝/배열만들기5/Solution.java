package programmers.코딩기초트레이닝.배열만들기5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Stream.of(intStrs).mapToInt(str -> Integer.parseInt(str.substring(s, s + l))).filter(i -> i > k).toArray();
    }



    public int[] solution1(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            int intSubStr = Integer.parseInt(intStr.substring(s, s + l));
            if (intSubStr > k) list.add(intSubStr);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5))); // [56789, 99999]

    }
}
