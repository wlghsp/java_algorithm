package programmers.level1.크기가작은부분문자열;

public class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        for (int i = 0; i < t.length() - pLen + 1; i++) {
            long num = Long.parseLong(t.substring(i, i + pLen));
            if (num <= Long.parseLong(p)) answer++;
        }

        return answer;
    }

}
