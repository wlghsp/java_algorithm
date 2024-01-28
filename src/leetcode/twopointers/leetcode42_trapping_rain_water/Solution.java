package leetcode.twopointers.leetcode42_trapping_rain_water;

import java.util.Stack;

public class Solution {

    public int trap(int[] height) {
        int volume = 0;

        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];

        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            // 더 높은 쪽을 향해 투 포인터 이동
            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left++;
            } else {
                volume += rightMax - height[right];
                right--;
            }
        }

        return volume;
    }

}
