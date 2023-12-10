package programmers.level1.문자열다루기기본;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.solution("a234");
        boolean result2 = s.solution("1234");
        assertFalse(result1);
        assertTrue(result2);
    }
}