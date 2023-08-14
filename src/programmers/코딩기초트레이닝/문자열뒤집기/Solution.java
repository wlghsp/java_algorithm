package programmers.코딩기초트레이닝.문자열뒤집기;

public class Solution {

    public String solution(String my_string, int s, int e) {
        String subStr = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        return my_string.substring(0, s) + subStr + my_string.substring(e + 1);
    }
    public String solution1(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();
        String subStr = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        int idx = 0;
        for (int i = s; i <= e; i++) {
            charArray[i] = subStr.charAt(idx++);
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Progra21Sremm3", 6, 12)); // "ProgrammerS123"
        System.out.println(s.solution("Stanley1yelnatS", 4, 10)); // "Stanley1yelnatS"

    }
}
