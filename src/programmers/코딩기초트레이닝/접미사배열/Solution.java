package programmers.코딩기초트레이닝.접미사배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public String[] solution(String my_string) {
        return IntStream.range(0, my_string.length())
                .mapToObj(my_string::substring)
                .sorted()
                .toArray(String[]::new);
    }
    public String[] solution1(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(my_string.length() - i - 1);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("banana")));

    }
}
