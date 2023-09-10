package programmers.level1.없는숫자더하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        assertEquals(14, result1);
    }
}