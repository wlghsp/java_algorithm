package leetcode.leetcode20_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testValidParentheses() {
        Solution s = new Solution();
        boolean result1 = s.isValid("()");
        boolean result2 = s.isValid("()[]{}");
        boolean result3 = s.isValid("(]");
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }
}