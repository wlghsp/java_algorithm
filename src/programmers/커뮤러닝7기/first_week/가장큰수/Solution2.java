package programmers.커뮤러닝7기.first_week.가장큰수;

import java.util.stream.*;

public class Solution2 {

    public String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) return "0";
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{6, 10, 2})); // "6210"
        System.out.println(s.solution(new int[]{3, 30, 34, 5, 9})); // "9534330"

    }
}
