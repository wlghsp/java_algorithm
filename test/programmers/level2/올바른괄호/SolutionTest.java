package programmers.level2.올바른괄호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.solution("()()");
        boolean result2 = s.solution("(())()");
        boolean result3 = s.solution(")()(");
        boolean result4 = s.solution("(()(");

        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}