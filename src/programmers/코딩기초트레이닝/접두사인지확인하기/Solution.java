package programmers.코딩기초트레이닝.접두사인지확인하기;

public class Solution {

    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("banana", "ban"));
        System.out.println(s.solution("banana", "nan"));
        System.out.println(s.solution("banana", "abcd"));
        System.out.println(s.solution("banana", "bananan"));

    }
}
