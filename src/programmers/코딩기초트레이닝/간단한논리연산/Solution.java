package programmers.코딩기초트레이닝.간단한논리연산;

public class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(false, true, true, true)); // true
        System.out.println(s.solution(true, false, false, false)); // false

    }
}
