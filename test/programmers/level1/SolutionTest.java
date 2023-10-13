package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.가장가까운같은글자.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testSolution() {
        Solution s = new Solution();
        int[] result1 = s.solution("banana");
        int[] result2 = s.solution("foobar");
        assertArrayEquals(new int[]{-1, -1, -1, 2, 2, 2}, result1);
        assertArrayEquals(new int[]{-1, -1, 1, -1, -1, -1}, result2);
    }
}