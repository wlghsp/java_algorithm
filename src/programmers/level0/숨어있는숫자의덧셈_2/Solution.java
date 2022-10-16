package programmers.level0.숨어있는숫자의덧셈_2;


import java.util.StringTokenizer;

public class Solution {

    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }
        return answer;
    }

    // 내 풀이
    public int solution1(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                int j = 0;
                StringBuilder num = new StringBuilder();
                while (true) {
                    if (i + j > my_string.length() - 1 || !Character.isDigit(my_string.charAt(i + j))) break;
                    else {
                        num.append(my_string.charAt(i + j));
                    }
                    j++;
                }
                i += j;
                answer += Integer.parseInt(num.toString());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));  // 37
        System.out.println(s.solution("1a2b3c4d123Z"));  // 133
    }
}
