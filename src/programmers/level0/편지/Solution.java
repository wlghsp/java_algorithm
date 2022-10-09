package programmers.level0.편지;

public class Solution {

    public int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("happy birthday!")); // 30
        System.out.println(s.solution("I love you~")); // 22
    }
}
