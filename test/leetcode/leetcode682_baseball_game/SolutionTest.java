package leetcode.leetcode682_baseball_game;

import leetcode.etc.leetcode682_baseball_game.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.calPoints(new String[]{"5", "2", "C", "D", "+"});
        int result2 = s.calPoints(new String[]{"5","-2","4","C","D","9","+","+"});

        assertEquals(30, result1);
        assertEquals(27, result2);
    }
}