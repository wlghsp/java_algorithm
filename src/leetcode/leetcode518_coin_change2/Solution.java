package leetcode.leetcode518_coin_change2;

public class Solution {

    // 2차원 풀이
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[amount + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < amount + 1; i++) {
            for (int j = n - 1; j >= 0; j--) {
                dp[i][j] = dp[i][j + 1];
                if (i - coins[j] >= 0) {
                    dp[i][j] += dp[i - coins[j]][j];
                }
            }
        }

        return dp[amount][0];
    }

    // 1차원 풀이
    public int change1(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j < amount + 1; j++) {
                    dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.change(5, new int[]{1,2,5})); // 4
        System.out.println(s.change(3, new int[]{2})); // 0
        System.out.println(s.change(10, new int[]{10})); // 1
    }
}
