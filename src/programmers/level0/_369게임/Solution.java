package programmers.level0._369게임;

public class Solution {
    public int solution(int order) {
        String s = String.valueOf(order);
        return (int) s.chars().filter(c -> c == '3' || c == '6' || c == '9').count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));      // 1
        System.out.println(s.solution(29423));  // 2
    }
}
