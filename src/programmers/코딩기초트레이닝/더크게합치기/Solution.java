package programmers.코딩기초트레이닝.더크게합치기;

public class Solution {

    public int solution(int a, int b) {
        int a1 = Integer.parseInt(a + String.valueOf(b));
        int a2 = Integer.parseInt(b + String.valueOf(a));
        return Math.max(a1, a2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(9, 91)); // 991
        System.out.println(s.solution(89, 8)); // 898

    }
}
