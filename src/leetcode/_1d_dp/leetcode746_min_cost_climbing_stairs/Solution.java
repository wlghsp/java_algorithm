package leetcode._1d_dp.leetcode746_min_cost_climbing_stairs;

import java.util.Arrays;

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        cost = Arrays.copyOf(cost, cost.length + 1);
        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);
    }
}
