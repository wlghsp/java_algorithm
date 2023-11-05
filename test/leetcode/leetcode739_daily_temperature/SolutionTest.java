package leetcode.leetcode739_daily_temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testDailyTemperature() {
        Solution s = new Solution();
        int[] result1 = s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        int[] result2 = s.dailyTemperatures(new int[]{30, 40, 50, 60});
        int[] result3 = s.dailyTemperatures(new int[]{30, 60, 90});
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, result1);
        assertArrayEquals(new int[]{1,1,1,0}, result2);
        assertArrayEquals(new int[]{1,1,0}, result3);


    }
}