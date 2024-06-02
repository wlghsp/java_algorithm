package leetcode._1d_dp.leetcode198_house_robber;

import java.util.Arrays;

public class Solution {
    // [1, 2, 3, 1]
    public int rob(int[] nums) {
        nums = Arrays.copyOf(nums, nums.length + 1);

        for (int i = nums.length - 3; i >= 0; i--) {
                nums[i] = Math.max(nums[i] + nums[i + 2], nums[i + 1]);
        }
        return Math.max(nums[0], nums[1]);
    }

    public int rob1(int[] nums) {
        int rob1 = 0, rob2 = 0;
        int temp;
        for (int num : nums) {
            temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return 0;
    }

}
