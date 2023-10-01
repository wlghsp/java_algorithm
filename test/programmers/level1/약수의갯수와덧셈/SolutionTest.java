package programmers.level1.약수의갯수와덧셈;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(13, 17);
        int result2 = s.solution(24, 27);
        assertEquals(43, result1);
        assertEquals(52, result2);
    }
}