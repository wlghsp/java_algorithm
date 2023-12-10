package programmers.level2.이진변환반복하기;

import java.util.Arrays;

public class Solution {

    private int countZeros(String s) {
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        return zeros;
    }
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        // s가 "1"이 될 때까지 반복하며 loop, removed 누적
        while (!s.equals("1")) {
            // s 변환하며 loop, removed 누적
            int zeros = countZeros(s);
            removed += zeros;
            loop++;


            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[]{loop, removed};
    }

    public int[] solution1(String s) {
        int zeroCnt = 0;
        int cnt = 0;
        while (!s.equals("1")) {
            zeroCnt += countZero(s);
            s = s.replace("0", "");
            s = toBinary(s.length());
            cnt++;
        }
        return new int[]{cnt, zeroCnt};
    }

    private int countZero(String s) {
        return (int) s.chars().filter(c -> c == '0').count();
    }

    public String toBinary(int num) {
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int i = num % 2;
            num /= 2;
            result.insert(0, i);
        }
        return result.toString();
    }
}
