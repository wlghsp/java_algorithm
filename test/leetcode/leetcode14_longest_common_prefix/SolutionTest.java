package leetcode.leetcode14_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String result2 = s.longestCommonPrefix(new String[]{"dog","racecar","car"});

        assertEquals("fl", result1);
        assertEquals("", result2);
    }
}