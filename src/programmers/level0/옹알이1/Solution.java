package programmers.level0.옹알이1;


public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            for (String word : words) {
                s = s.replace(word, "0");
            }
            if (s.replaceAll("0", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
