package programmers.코딩기초트레이닝._9로나눈나머지;

public class Solution {

    public int solution(String number) {
        return number.chars().map(c -> (c - '0')).sum() % 9;
    }
    public int solution1(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        return sum % 9;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("123")); // 6
        System.out.println(s.solution("78720646226947352489")); // 6
    }
}
