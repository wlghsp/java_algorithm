package programmers.level2.피보나치수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(3);
        int result2 = s.solution(5);

        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}