package leetcode.leetcode289_word_pattern;

import leetcode.etc.leetcode289_word_pattern.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.wordPattern("abba", "dog cat cat dog");
        boolean result2 = s.wordPattern("abba", "dog cat cat fish");
        boolean result3 = s.wordPattern("aaaa", "dog cat cat dog");

        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
    }
}