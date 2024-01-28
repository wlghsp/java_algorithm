package leetcode.leetcode567_permutation_in_string;

import leetcode.slidingwindow.leetcode567_permutation_in_string.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testPermutationInString() {
        Solution s = new Solution();

        boolean result1 = s.checkInclusion("ab", "eidbaooo");
        boolean result2 = s.checkInclusion("ab", "eidboaoo");

        assertTrue(result1);
        assertFalse(result2);
    }
}