package programmers.level0.세균증식;

public class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 10));  // 2048
        System.out.println(s.solution(7, 15));  // 229,376
    }
}
