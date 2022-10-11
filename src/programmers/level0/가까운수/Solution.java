package programmers.level0.가까운수;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int minVal = Integer.MAX_VALUE;
        int answer = -1;
        for (int i : array) {
            if (Math.abs(n-i) < minVal) {
                minVal = Math.abs(n - i);
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 10, 30}, 20)); // 28
        System.out.println(s.solution(new int[]{10, 11, 12}, 13)); // 12
    }
}
