package leetcode.greedy.leetcode846_hand_of_straights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3);
        boolean result2 = s.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4);
        assertTrue(result1);
        assertFalse(result2);
    }
}