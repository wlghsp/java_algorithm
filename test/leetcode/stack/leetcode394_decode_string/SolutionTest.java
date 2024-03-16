package leetcode.stack.leetcode394_decode_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.decodeString("3[a]2[bc]");
        String result2 = s.decodeString("3[a2[c]]");
        String result3 = s.decodeString("2[abc]3[cd]ef");

        assertEquals("aaabcbc", result1);
        assertEquals("accaccacc", result2);
        assertEquals("abcabccdcdcdef", result3);
    }
}