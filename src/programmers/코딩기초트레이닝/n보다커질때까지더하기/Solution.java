package programmers.코딩기초트레이닝.n보다커질때까지더하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(s.solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
