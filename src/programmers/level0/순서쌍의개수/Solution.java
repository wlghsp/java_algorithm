package programmers.level0.순서쌍의개수;

import java.util.stream.IntStream;

public class Solution {

    public int solution1(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }
        return answer;
    }

    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(20)); // 6
        System.out.println(s.solution(100)); // 9
    }
}
