package leetcode.leetcode128_LongestConsecutiveSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void longestConsecutiveSequenceTest() {
        Solution s = new Solution();
        int result1 = s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        int result2 = s.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        int result3 = s.longestConsecutive(new int[]{1,2, 0, 1});

        assertEquals(4, result1);
        assertEquals(9, result2);
        assertEquals(3, result3);
    }
}