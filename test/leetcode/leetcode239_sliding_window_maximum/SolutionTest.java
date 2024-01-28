package leetcode.leetcode239_sliding_window_maximum;

import leetcode.slidingwindow.leetcode239_sliding_window_maximum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        int[] result2 = s.maxSlidingWindow(new int[]{1}, 1);

        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, result1);
        assertArrayEquals(new int[]{1}, result2);
    }
}