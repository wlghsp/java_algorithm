package leetcode._1d_dp.leetcode746_min_cost_climbing_stairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.minCostClimbingStairs(new int[]{10, 15, 20});
        int result2 = s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});

        Assertions.assertThat(result1).isEqualTo(15);
        Assertions.assertThat(result2).isEqualTo(6);
    }
}