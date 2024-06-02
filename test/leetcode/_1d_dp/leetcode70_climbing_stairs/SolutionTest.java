package leetcode._1d_dp.leetcode70_climbing_stairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.climbStairs(2);
        int result2 = s.climbStairs(3);
        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(3);
    }
}