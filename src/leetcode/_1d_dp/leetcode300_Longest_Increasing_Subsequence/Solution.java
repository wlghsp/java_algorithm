package leetcode._1d_dp.leetcode300_Longest_Increasing_Subsequence;

public class Solution {
    static int[] dp = new int[2501];
    public int lengthOfLIS(int[] nums) {
        int answer = 0;
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (val < dp[j]) val = dp[j];
                }
            }
            dp[i] = val + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (answer < dp[i]) answer = dp[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 4
    }
}
