package leetcode.leetcode1929_concatenation_of_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.getConcatenation(new int[]{1, 2, 1});
        int[] result2 = s.getConcatenation(new int[]{1, 3, 2, 1});

        assertArrayEquals(new int[]{1,2,1,1,2,1}, result1);
        assertArrayEquals(new int[]{1,3,2,1,1,3,2,1}, result2);

    }
}