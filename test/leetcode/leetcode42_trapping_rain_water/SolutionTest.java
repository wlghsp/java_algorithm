package leetcode.leetcode42_trapping_rain_water;

import leetcode.twopointers.leetcode42_trapping_rain_water.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void trappingRainWaterTest() {
        Solution s = new Solution();
        int result1 = s.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        int result2 = s.trap(new int[]{4,2,0,3,2,5});

        assertEquals(6, result1);
        assertEquals(9, result2);

    }
}