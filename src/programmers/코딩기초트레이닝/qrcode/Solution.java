package programmers.코딩기초트레이닝.qrcode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(int q, int r, String code) {
       return IntStream.range(0, code.length()).filter(i -> i % q == r)
               .mapToObj(c -> String.valueOf(code.charAt(c)))
               .collect(Collectors.joining());
    }


    public String solution1(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 1, "qjnwezgrpirldywt")); // "jerry"
    }
}
