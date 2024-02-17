package leetcode.heap_priorityqueue.leetcode973_k_closest_points_to_origin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[][] result1 = s.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
        int[][] result2 = s.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        assertArrayEquals(new int[][]{{-2, 2}}, result1);
        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, result2);
    }
}