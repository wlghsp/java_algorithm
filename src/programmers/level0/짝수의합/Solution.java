package programmers.level0.짝수의합;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
      return IntStream.rangeClosed(0, n)
              .filter(i -> i % 2 == 0)
              .sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(10)); // 30
        System.out.println(s.solution(4));  // 6
    }

}
