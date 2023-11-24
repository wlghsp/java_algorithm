package leetcode.leetcode58_length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.lengthOfLastWord("Hello World");
        int result2 = s.lengthOfLastWord("   fly me   to   the moon  ");
        int result3 = s.lengthOfLastWord("luffy is still joyboy");

        assertEquals(5, result1);
        assertEquals(4, result2);
        assertEquals(6, result3);

    }
}