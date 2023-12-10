package programmers.level1.문자열내p와y의개수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.solution("pPoooyY");
        boolean result2 = s.solution("Pyy");
        assertTrue(result1);
        assertFalse(result2);

    }
}