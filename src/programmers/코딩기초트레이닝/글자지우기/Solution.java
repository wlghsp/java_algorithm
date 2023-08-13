package programmers.코딩기초트레이닝.글자지우기;

public class Solution {

    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        boolean[] removeOkay = new boolean[my_string.length()];
        for (int i : indices) {
            removeOkay[i] = true;
        }
        for (int i = 0; i < my_string.length(); i++) {
            if (!removeOkay[i]) answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("apporoograpemmemprs",
                new int[]{1, 16, 6, 15, 0, 10, 11, 3})); // "programmers"
    }
}
