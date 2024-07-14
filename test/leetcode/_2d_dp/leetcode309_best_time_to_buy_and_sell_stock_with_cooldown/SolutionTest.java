package leetcode._2d_dp.leetcode309_best_time_to_buy_and_sell_stock_with_cooldown;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.maxProfit(new int[]{1, 2, 3, 0, 2});
        int result2 = s.maxProfit(new int[]{1});

        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(0);
    }
}