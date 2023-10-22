package leetcode.leetcode242_valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void validAnagramTest() {
        Solution s = new Solution();
        boolean result1 = s.isAnagram("anagram", "nagaram");
        boolean result2 = s.isAnagram("rat", "car");
        assertTrue(result1);
        assertFalse(result2);
    }
}