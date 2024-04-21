package leetcode.graph.leetcode684_redundant_connection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.findRedundantConnection(new int[][]{
                {1, 2}, {1, 3}, {2, 3}}
        );
        int[] result2 = s.findRedundantConnection(new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}
        );

        assertArrayEquals(new int[]{2, 3}, result1);
        assertArrayEquals(new int[]{1, 4}, result2);
    }
}