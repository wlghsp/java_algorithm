package leetcode.leetcode67_add_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.addBinary("11", "1");
        String result2 = s.addBinary("1010", "1011");

        assertEquals("100", result1);
        assertEquals("10101", result2);
    }
}