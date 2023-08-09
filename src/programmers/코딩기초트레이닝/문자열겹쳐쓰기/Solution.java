package programmers.코딩기초트레이닝.문자열겹쳐쓰기;

public class Solution {

    public String solution(String my_string, String overwrite_string, int s) {
        char[] charArray = my_string.toCharArray();
        int idx = 0;
        for (int i = s; i < s + overwrite_string.length(); i++) {
            charArray[i] = overwrite_string.charAt(idx++);
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("He11oWor1d","lloWorl", 2));
        System.out.println(s.solution("Program29b8UYP","merS123", 7));

    }
}
