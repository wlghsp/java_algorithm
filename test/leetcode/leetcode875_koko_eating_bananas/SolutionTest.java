package leetcode.leetcode875_koko_eating_bananas;

import leetcode.binarysearch.leetcode875_koko_eating_bananas.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testKoko() {
        Solution s = new Solution();
        int[] piles1 = {3, 6, 7, 11};
        int[] piles2 = {30,11, 23, 4, 20};
        int h1 = 8;
        int h2 = 5;
        int result1 = s.minEatingSpeed(piles1, h1);
        int result2 = s.minEatingSpeed(piles2, h2);
        assertEquals(4, result1);
        assertEquals(30, result2);
    }
}