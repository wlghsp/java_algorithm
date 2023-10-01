package programmers.level1._3진법뒤집기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(45);
        int result2 = s.solution(125);
        assertEquals(7, result1);
        assertEquals(229, result2);
    }
}