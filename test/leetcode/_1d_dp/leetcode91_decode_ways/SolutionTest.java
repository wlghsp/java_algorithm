package leetcode._1d_dp.leetcode91_decode_ways;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.numDecodings("12");
        int result2 = s.numDecodings("226");
        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(3);
    }
}