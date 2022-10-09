package programmers.level0.문자열뒤집기;

public class Solution {

    public String solution(String my_string) {
//        for (int i = my_string.length() -1; i >= 0; i--) {
//            answer += my_string.charAt(i);
//        }
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("jaron")); // "noraj"
        System.out.println(s.solution("bread")); // "daerb"
    }
}
