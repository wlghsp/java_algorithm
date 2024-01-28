package leetcode.leetcode392_is_subsequence;

import leetcode.etc.leetcode392_is_subsequence.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.isSubsequence("abc", "ahbgdc");
        boolean result2 = s.isSubsequence("axc", "ahbgdc");
        assertTrue(result1);
        assertFalse(result2);
    }
}