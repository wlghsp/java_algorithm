package programmers.코딩기초트레이닝.배열에서문자열대소문자변환하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new String[]{"AAA","BBB","CCC","DDD"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"aBc","AbC"})));

    }
}
