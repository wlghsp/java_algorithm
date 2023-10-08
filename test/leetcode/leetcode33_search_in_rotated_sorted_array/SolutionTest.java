package leetcode.leetcode33_search_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        int result2 = s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        int result3 = s.search(new int[]{1}, 0);

        assertEquals(4, result1);
        assertEquals(-1, result2);
        assertEquals(-1, result3);
    }
}