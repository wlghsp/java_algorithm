package programmers.커뮤러닝7기.first_week.예산;

import java.util.stream.IntStream;

public class Solution2 {

    public int solution(int[] budgets, int M) {
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);


        int answer = 0;
        while (min <= max) {
            final int mid = (min + max) / 2;
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1,3,2,5,4}, 9));  // 3
        System.out.println(s.solution(new int[]{2,2,3,3}, 10));  // 4
    }
}
