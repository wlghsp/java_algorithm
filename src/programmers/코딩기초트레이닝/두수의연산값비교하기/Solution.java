package programmers.코딩기초트레이닝.두수의연산값비교하기;

public class Solution {
    public int solution(int a, int b) {
        int first = Integer.parseInt(a + String.valueOf(b));
        int second = 2 * a * b;
        return Math.max(first, second);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 91)); // 364
        System.out.println(s.solution(91, 2)); // 912
    }
}
