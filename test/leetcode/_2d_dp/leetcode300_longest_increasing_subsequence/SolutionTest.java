package leetcode._2d_dp.leetcode300_longest_increasing_subsequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test1() {
        Solution s = new Solution();
        int result1 = s.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        int result2 = s.lengthOfLIS(new int[]{0,1,0,3,2,3});
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(4);
    }
}