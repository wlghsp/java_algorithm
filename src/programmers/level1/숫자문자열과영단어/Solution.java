package programmers.level1.숫자문자열과영단어;

public class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
