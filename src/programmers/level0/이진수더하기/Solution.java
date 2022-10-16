package programmers.level0.이진수더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("10", "11")); // "101"
        System.out.println(s.solution("1001", "1111")); // "11000"
    }
}
