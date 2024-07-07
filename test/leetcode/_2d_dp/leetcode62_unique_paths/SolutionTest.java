package leetcode._2d_dp.leetcode62_unique_paths;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.uniquePaths(3, 7);
        int result2 = s.uniquePaths(3, 2);
        Assertions.assertThat(result1).isEqualTo(28);
        Assertions.assertThat(result2).isEqualTo(3);
    }
}