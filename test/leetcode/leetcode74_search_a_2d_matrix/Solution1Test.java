package leetcode.leetcode74_search_a_2d_matrix;

import leetcode.binarysearch.leetcode74_search_a_2d_matrix.Solution1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void testSolution1() {
        Solution1 s1 = new Solution1();
        boolean result1 = s1.searchMatrix(new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        }, 3);

        boolean result2 = s1.searchMatrix(new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        }, 13);
        assertTrue(result1);
        assertFalse(result2);
    }
}