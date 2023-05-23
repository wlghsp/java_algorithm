package programmers.코딩기초트레이닝.첫번째로나오는음수;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .filter(i -> num_list[i] < 0)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(s.solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}
