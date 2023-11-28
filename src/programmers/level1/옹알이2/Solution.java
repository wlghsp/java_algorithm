package programmers.level1.옹알이2;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            for(int i = 0; i < words.length; i++) {
                s = s.replace(words[i], i + "");
            }
            if (check(s)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean check(String s) {
        // 1. 알파벳 포함 여부 체크
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) return false;
        }

        // 2. 연속된 숫자인지 체크
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
