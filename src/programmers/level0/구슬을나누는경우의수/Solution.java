package programmers.level0.구슬을나누는경우의수;

public class Solution {

    public int solution(int balls, int share) {
        return combi(balls, share);
    }

    public int combi(int n, int r) {
        if (r == 0 || n == r) return 1;
        else {
            return combi(n - 1, r) + combi(n - 1, r - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 2)); // 3
        System.out.println(s.solution(5, 3)); // 10
    }
}
