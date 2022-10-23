package programmers.커뮤러닝7기.first_week.가장큰수;

import java.util.*;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        boolean expect = true;
        String[] num = new String[numbers.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = String.valueOf(numbers[i]);
            if (numbers[i] != 0) expect = false;
        }

        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (int i = 0; i < num.length; i++) {
            answer += num[i];
        }
        if (expect) answer = "0";

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{6, 10, 2})); // "6210"
        System.out.println(s.solution(new int[]{3, 30, 34, 5, 9})); // "9534330"

    }
}
