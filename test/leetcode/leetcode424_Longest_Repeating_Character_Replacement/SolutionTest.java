package leetcode.leetcode424_Longest_Repeating_Character_Replacement;

import leetcode.slidingwindow.leetcode424_Longest_Repeating_Character_Replacement.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void testLongestRepeatingCharacterReplacement() {
        Solution s = new Solution();
        int result1 = s.characterReplacement("ABAB", 2);
        int result2 = s.characterReplacement("AABABBA", 1);

        assertEquals(4, result1);
        assertEquals(4, result2);
    }
}