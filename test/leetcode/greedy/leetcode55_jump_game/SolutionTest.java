package leetcode.greedy.leetcode55_jump_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.canJump(new int[]{2, 3, 1, 1, 4});
        boolean result2 = s.canJump(new int[]{3, 2, 1, 0, 4});

        assertTrue(result1);
        assertFalse(result2);
    }
}