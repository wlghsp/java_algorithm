package leetcode.graph.leetcode207_course_schedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();

        boolean result1 = s.canFinish(2, new int[][]{{1, 0}});
        boolean result2 = s.canFinish(2, new int[][]{{1, 0}, {0, 1}});

        assertTrue(result1);
        assertFalse(result2);
    }
}