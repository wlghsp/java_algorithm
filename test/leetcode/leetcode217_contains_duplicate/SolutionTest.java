package leetcode.leetcode217_contains_duplicate;

import leetcode.arrays_hashing.leetcode217_contains_duplicate.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void containsDuplicateTest() {
        Solution s = new Solution();
        boolean result1 = s.containsDuplicate(new int[]{1, 2, 3, 1});
        boolean result2 = s.containsDuplicate(new int[]{1, 2, 3, 4});
        boolean result3 = s.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }
}