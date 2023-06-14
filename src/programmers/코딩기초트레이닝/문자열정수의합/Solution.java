package programmers.코딩기초트레이닝.문자열정수의합;

public class Solution {
    public int solution(String num_str) {
        return num_str.chars()
                .map(Character::getNumericValue) // 각 문자를 해당하는 숫자로 변환
                .sum();  // 합을 구함
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("123456789")); // 45
        System.out.println(s.solution("1000000"));  // 1
    }
}
