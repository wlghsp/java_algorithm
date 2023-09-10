package programmers.level1.없는숫자더하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
