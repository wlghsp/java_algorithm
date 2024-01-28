package leetcode.leetcode3_longest_substring_without_repeating_characters;

import leetcode.slidingwindow.leetcode3_longest_substring_without_repeating_characters.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLongestSubstringWithoutRepeatingCharacters() {
        Solution s = new Solution();
        int result1 = s.lengthOfLongestSubstring("abcabcbb");
        int result2 = s.lengthOfLongestSubstring("bbbbb");
        int result3 = s.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result1);
        assertEquals(1, result2);
        assertEquals(3, result3);
    }
}