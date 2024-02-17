package leetcode.heap_priorityqueue.leetcode1046_last_stone_weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result = s.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        assertEquals(1, result);
    }
}