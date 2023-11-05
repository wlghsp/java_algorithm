package leetcode.leetcode121_Best_Time_to_Buy_and_SellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testBestTimeToBuyAndSellStock() {
        Solution s = new Solution();
        int result1 = s.maxProfit(new int[]{7, 1, 3, 5, 6, 4});
        int result2 = s.maxProfit(new int[]{7, 6, 4, 3, 1});

        assertEquals(5, result1);
        assertEquals(0, result2);
    }
}