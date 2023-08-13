package leetcode.leetcode416_partition_equal_subset_sum;

import java.util.Arrays;

public class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length < 2) return false;
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;

        int subsetSum = sum / 2;
        boolean[] dp = new boolean[subsetSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = subsetSum; j >= num; --j) {
                dp[j] = dp[j] || dp[j - num];

                if(dp[subsetSum]) return true;
            }
        }
        return dp[subsetSum];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canPartition(new int[]{1, 5, 11, 5})); // true
        System.out.println(s.canPartition(new int[]{1, 2, 3, 5})); // false
    }
}
