package leetcode._1d_dp.leetcode198_house_robber;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.rob(new int[]{1, 2, 3, 1});
        int result2 = s.rob(new int[]{2, 7, 9, 3, 1});
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(12);
    }
}