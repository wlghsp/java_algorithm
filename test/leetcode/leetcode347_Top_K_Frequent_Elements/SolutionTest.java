package leetcode.leetcode347_Top_K_Frequent_Elements;

import leetcode.arrays_hashing.leetcode347_Top_K_Frequent_Elements.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testTopKFrequentElements() {
        Solution s = new Solution();
        int[] result1 = s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        int[] result2 = s.topKFrequent(new int[]{1}, 1);

        assertArrayEquals(new int[]{1,2}, result1);
        assertArrayEquals(new int[]{1}, result2);
    }
}