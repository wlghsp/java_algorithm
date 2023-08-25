package programmers.코딩기초트레이닝.문자열여러번뒤집기;

public class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        for (int[] q : queries) {
            int i  = q[0];
            int j  = q[1];
            while (i < j) {
                char tmp = charArray[i];
                charArray[i++] = charArray[j];
                charArray[j--] = tmp;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9},{6, 10}}));
    }
}
