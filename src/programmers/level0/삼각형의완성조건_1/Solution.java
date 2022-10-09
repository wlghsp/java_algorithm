package programmers.level0.삼각형의완성조건_1;

import java.util.Arrays;

public class Solution {

    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[1] + sides[0]) ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3}));  // 2
        System.out.println(s.solution(new int[]{3, 6, 2}));  // 2
        System.out.println(s.solution(new int[]{199, 72, 222}));  // 1
    }
}
