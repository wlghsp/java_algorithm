package leetcode.etc.leetcode733_floo_fill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[][] result1 = s.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        int[][] result2 = s.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0);

        assertArrayEquals(result1, new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
        assertArrayEquals(result2, new int[][]{{0, 0, 0}, {0, 0, 0}});
    }
}