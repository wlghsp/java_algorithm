package leetcode._1d_dp.leetcode322_coin_change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.coinChange(new int[]{1, 2, 5}, 11);
        int result2 = s.coinChange(new int[]{2}, 3);
        int result3 = s.coinChange(new int[]{1}, 0);
        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(-1);
        Assertions.assertThat(result3).isEqualTo(0);
    }
}