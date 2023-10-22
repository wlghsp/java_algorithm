package leetcode.leetcode11_container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int lt = 0;
        int rt = height.length - 1;
        int maxArea = 0;

        while (lt < rt) {
            maxArea  = Math.max(maxArea, (rt - lt) * Math.min(height[lt], height[rt]));

            if (height[lt] < height[rt]) {
                lt++;
            } else {
                rt--;
            }
        }


        return maxArea;
    }
}
