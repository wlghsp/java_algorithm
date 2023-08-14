package programmers.코딩기초트레이닝._1로만들기;

import java.util.Arrays;

public class Solution {

    public int solution(int[] num_list) {
        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
    }
    public int solution1(int[] num_list) {
        int answer = 0;
        for (int i : num_list) {
            while (i != 1) {
                i /= 2;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{12, 4, 15, 1, 14})); // 11
    }
}
