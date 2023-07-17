package programmers.코딩기초트레이닝.홀짝에따라다른값반환하기;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        return n % 2 == 1 ?
                IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum()
                : IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(7)); // 16
        System.out.println(s.solution(10)); // 220
    }
}
