package leetcode._1d_dp.leetcode322_coin_change;

import java.util.Arrays;

public class Solution {


    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
        return dp[amount] == 10001 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.coinChange(new int[]{1, 2, 5}, 11)); // 3
        System.out.println(s.coinChange(new int[]{2}, 3)); // -1
        System.out.println(s.coinChange(new int[]{1}, 0)); // 0
        System.out.println(s.coinChange(new int[]{186,419,83,408}, 6249)); // 20
    }
}
