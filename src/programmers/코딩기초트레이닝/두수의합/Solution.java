package programmers.코딩기초트레이닝.두수의합;

import java.math.BigInteger;

public class Solution {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("18446744073709551615", "287346502836570928366")); // "305793246910280479981"
    }
}
