package leetcode.leetcode11_container_with_most_water;

import leetcode.twopointers.leetcode11_container_with_most_water.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void containerWithMostWaterTest() {
        Solution s = new Solution();
        int result1 = s.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        int result2 = s.maxArea(new int[]{1, 1});

        assertEquals(49, result1);
        assertEquals(1, result2);

    }
}