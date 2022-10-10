package programmers.level0.피자나눠먹기_3;

public class Solution {
    public int solution(int slice, int n) {
        return (n % slice) == 0 ? (n / slice) : (n / slice) + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7, 10)); // 2
        System.out.println(s.solution(4, 12)); // 3
    }
}
