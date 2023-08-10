package programmers.코딩기초트레이닝.날짜비교하기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        String d1 = Arrays.stream(date1).mapToObj(String::valueOf).collect(Collectors.joining());
        String d2 = Arrays.stream(date2).mapToObj(String::valueOf).collect(Collectors.joining());
        return Integer.parseInt(d1) < Integer.parseInt(d2) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29})); // 1
        System.out.println(s.solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24})); // 0

    }
}
