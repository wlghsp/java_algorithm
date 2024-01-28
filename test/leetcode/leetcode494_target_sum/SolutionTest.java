package leetcode.leetcode494_target_sum;

import leetcode._2d_dp.leetcode494_target_sum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        int result2 = s.findTargetSumWays(new int[]{1}, 1);

        assertEquals(5, result1);
        assertEquals(1, result2);
    }
}