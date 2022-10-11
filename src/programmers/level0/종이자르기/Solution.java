package programmers.level0.종이자르기;

public class Solution {

    public int solution(int M, int N) {
        return M * N - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 2)); // 3
        System.out.println(s.solution(2, 5)); // 9
        System.out.println(s.solution(1, 1)); // 0
    }
}
