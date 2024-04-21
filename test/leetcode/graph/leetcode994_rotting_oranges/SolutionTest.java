package leetcode.graph.leetcode994_rotting_oranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}});
        int result2 = s.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}});
        int result3 = s.orangesRotting(new int[][]{{0, 2}});

        assertEquals(4, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }
}