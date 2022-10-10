package programmers.level0.대문자와소문자;

public class Solution {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("cccCCC")); // "CCCccc"
        System.out.println(s.solution("abCdEfghIJ")); // "ABcDeFGHij"
    }
}
