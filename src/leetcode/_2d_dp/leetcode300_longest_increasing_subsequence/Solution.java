package leetcode._2d_dp.leetcode300_longest_increasing_subsequence;

import java.util.Arrays;

public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;

        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int val = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if(val < dp[j]) val = dp[j];
                }
            }
            dp[i] = val + 1;
        }
        return Arrays.stream(dp)
                .max()
                .orElse(0);
    }
}
