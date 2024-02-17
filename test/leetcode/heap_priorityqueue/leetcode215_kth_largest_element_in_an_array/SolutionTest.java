package leetcode.heap_priorityqueue.leetcode215_kth_largest_element_in_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        int result2 = s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
        assertEquals(5, result1);
        assertEquals(4, result2);
    }
}