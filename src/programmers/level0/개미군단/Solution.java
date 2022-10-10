package programmers.level0.개미군단;

public class Solution {

    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp / 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(23));   // 5
        System.out.println(s.solution(24));   // 6
        System.out.println(s.solution(999));  // 201
    }
}
