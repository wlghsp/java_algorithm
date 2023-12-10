package programmers.level1.자연수뒤집어배열로만들기;

public class Solution {

    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int[] answer = new int[strN.length()];
        for (int i = 0; i < strN.length(); i++) {
            answer[i] = strN.charAt(strN.length() - 1 - i) - '0';
        }
        return answer;
    }
}
