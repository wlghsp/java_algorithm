package programmers.코딩기초트레이닝.문자열곱하기;

public class Solution {

    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("string", 3)); // "stringstringstring"
        System.out.println(s.solution("love", 10)); // "lovelovelovelovelovelovelovelovelovelove"
    }
}
