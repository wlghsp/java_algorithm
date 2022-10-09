package programmers.level0.문자반복출력하기;

public class Solution {

    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
//            sb.append(String.valueOf(c).repeat(n));
            for (int j = 0; j < n; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 3)); // "hhheeellllllooo"
    }
}
