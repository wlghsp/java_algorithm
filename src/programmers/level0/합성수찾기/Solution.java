package programmers.level0.합성수찾기;

import java.util.stream.IntStream;

public class Solution {

    // 약수의 개수가 세 개 이상인 수 = 합성수
    public int solution(int n) {
        return (int) IntStream.rangeClosed(4, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(t -> i % t == 0).count() >= 3).count();
    }

    // 약수의 개수가 세 개 이상인 수 = 합성수
    public int solution2(int n) {
        return (int) IntStream.rangeClosed(4, n).filter(i -> countDivisor(i) >= 3).count();
    }

    public int countDivisor(int k) {
        int cnt = 0;
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) cnt++;
        }
        return cnt;
    }

    // 약수의 개수가 세 개 이상인 수 = 합성수
    public int solution1(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int count = countDivisor(i);
            if (count >= 3) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10)); // 5
        System.out.println(s.solution(15)); // 8
    }
}
