package programmers.level0.피자나눠먹기_1;

public class Solution {

    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(7)); // 1
        System.out.println(s.solution(1)); // 1
        System.out.println(s.solution(15)); // 3
    }
}
