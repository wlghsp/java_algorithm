package leetcode.greedy.leetcode45_jump_game_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.jump(new int[]{2, 3, 1, 1, 4});
        int result2 = s.jump(new int[]{2, 3, 0, 1, 4});

        assertEquals(2, result1);
        assertEquals(2, result2);
    }
}