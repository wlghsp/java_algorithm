package programmers.level2.이진변환반복하기;

import java.util.Arrays;

public class Solution {

    public int[] solution(String s) {
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
