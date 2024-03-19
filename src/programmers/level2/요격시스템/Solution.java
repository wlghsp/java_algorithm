package programmers.level2.요격시스템;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(target -> target[1]));
        int count = 0;
        int last = Integer.MIN_VALUE;
        for (int[] target : targets) {
            if (target[0] >= last) {
                count++;
                last = target[1];
            }
        }


        return count;
    }
}
