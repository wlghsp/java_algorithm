package leetcode.leetcode152_maximum_product_subarray;

public class Solution {
    static int[][] dp;

    public int maxProduct(int[] nums) {

        dp = new int[20001][2];

        dp[0][0] = dp[0][1] = nums[0];

        int answer = dp[0][0];

        for (int i = 1; i < nums.length; i++) {

            dp[i][0] = Math.max(nums[i] * dp[i-1][0], Math.max(nums[i], nums[i] * dp[i - 1][1]));

            dp[i][1] = Math.min(nums[i] * dp[i-1][0], Math.min(nums[i], nums[i] * dp[i - 1][1]));

            if (answer < dp[i][0]) answer = dp[i][0];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProduct(new int[]{2,3,-2,4})); // 6
        System.out.println(s.maxProduct(new int[]{-2})); // -2
        System.out.println(s.maxProduct(new int[]{-2,3,-4})); // 24
    }
}
