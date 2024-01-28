package leetcode.leetcode167_two_sum_2_input_array_is_sorted;

import leetcode.twopointers.leetcode167_two_sum_2_input_array_is_sorted.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSumInputArrayIsSortedTest() {
        Solution s = new Solution();
        int[] result1 = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] result2 = s.twoSum(new int[]{2, 3, 4}, 6);
        int[] result3 = s.twoSum(new int[]{-1, 0}, -1);
        assertArrayEquals(new int[]{1, 2}, result1);
        assertArrayEquals(new int[]{1, 3}, result2);
        assertArrayEquals(new int[]{1, 2}, result3);
    }
}