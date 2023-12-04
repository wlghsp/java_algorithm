package programmers.level1.문자열나누기;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int xCnt = 1;
        int notXCnt = 0;
        for (int i = 1; i < s.length(); i++) {
            if (x == s.charAt(i)) xCnt++;
            else notXCnt++;

            if (xCnt == notXCnt) {
                answer++;
                if (i + 1 < s.length()) {
                    x = s.charAt(i++ +1);
                    xCnt = 1;
                    notXCnt = 0;
                }
            }
        }
        if (xCnt != notXCnt) answer++;

        return answer;
    }
}
