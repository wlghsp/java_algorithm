package leetcode.leetcode1_two_sum;

import leetcode.arrays_hashing.leetcode1_two_sum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void two_sum_test() {
        Solution s = new Solution();
        int[] result1 = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] result2 = s.twoSum(new int[]{3, 2, 4}, 6);
        int[] result3 = s.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result1);
        assertArrayEquals(new int[]{1, 2}, result2);
        assertArrayEquals(new int[]{0, 1}, result3);

    }
}