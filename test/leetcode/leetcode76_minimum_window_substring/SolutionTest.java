package leetcode.leetcode76_minimum_window_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMinimumWindowSubstring() {
        Solution s = new Solution();
        String result1 = s.minWindow("ADOBECODEBANC", "ABC");
        String result2 = s.minWindow("a", "a");
        String result3 = s.minWindow("a", "aa");


        assertEquals("BANC", result1);
        assertEquals("a", result2);
        assertEquals("", result3);
    }
}