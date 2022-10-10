package programmers.level0.숨어있는숫자의덧셈_1;

public class Solution {

    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp")); // 10
        System.out.println(s.solution("1a2b3c4d123")); // 16
    }
}
