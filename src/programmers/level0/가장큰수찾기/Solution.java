package programmers.level0.가장큰수찾기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array).max().getAsInt();
        answer[1] = IntStream.range(0, array.length)
                .filter(i -> array[i] == answer[0]).findFirst().getAsInt();
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 8, 3}))); // [8, 1]
        System.out.println(Arrays.toString(s.solution(new int[]{9, 10, 11, 8}))); // [11, 2]
    }
}
