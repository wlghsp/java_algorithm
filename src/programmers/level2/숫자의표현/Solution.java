package programmers.level2.숫자의표현;

public class Solution {
    /**
     * 자연수의 연속된 자연수의 합을 표현하는 방법의 수는
     * 주어진 수의 홀수 약수의 개수와 같다
     */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 투포인터 풀이
     * 1, 2 는 n을 만드는 방법은 1가지
     *
     */
    public int solution1(int n) {
        if (n <= 2) return 1;

        int answer = 1, left = 1, sum = 0;

        for (int right = 1; right <= (n / 2 + 1); right++) {
            sum += right;

            if (sum == n) answer++;

            while (sum >= n) {
                sum -= left++;
                if (sum == n) answer++;
            }
        }

        return answer;
    }
}
