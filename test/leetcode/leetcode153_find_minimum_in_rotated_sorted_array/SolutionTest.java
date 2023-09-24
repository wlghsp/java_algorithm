package leetcode.leetcode153_find_minimum_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testRotated() {
        Solution s = new Solution();
        int result1 = s.findMin(new int[]{3, 4, 5, 1, 2});
        int result2 = s.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});

        assertEquals(1, result1);
        assertEquals(0, result2);
    }
}