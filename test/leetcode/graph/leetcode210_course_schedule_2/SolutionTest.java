package leetcode.graph.leetcode210_course_schedule_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.findOrder(2, new int[][]{{1, 0}});
        int[] result2 = s.findOrder(2, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});

        assertArrayEquals(new int[]{0, 1}, result1);
        assertArrayEquals(new int[]{0, 2, 1, 3}, result2);
    }
}