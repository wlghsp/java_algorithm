package programmers.코딩기초트레이닝.주사위게임1;

public class Solution {

    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) answer += (a * a) + (b * b);
        else if (a % 2 != 0 || b % 2 != 0) answer += 2 * (a + b);
        else answer += Math.abs(a - b);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 5)); // 34
        System.out.println(s.solution(6, 1)); // 14
        System.out.println(s.solution(2, 4)); // 2

    }
}
