package programmers.코딩기초트레이닝.flag에따라다른값반환하기;

public class Solution {

    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int a = -4;
        int b = 7;
        System.out.println(s.solution(a, b, true));
        System.out.println(s.solution(a, b, false));
    }
}
