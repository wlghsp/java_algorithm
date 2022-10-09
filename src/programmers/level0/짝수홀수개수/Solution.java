package programmers.level0.짝수홀수개수;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] num_list) {
        return IntStream.of( (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count()
                ,(int) Arrays.stream(num_list).filter(i -> i % 2 != 0).count()).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,4,5}))); // [2,3]
        System.out.println(Arrays.toString(s.solution(new int[]{1,3,5,7}))); // [0,4]
    }
}
