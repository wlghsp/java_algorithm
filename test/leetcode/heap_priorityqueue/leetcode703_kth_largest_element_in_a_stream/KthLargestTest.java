package leetcode.heap_priorityqueue.leetcode703_kth_largest_element_in_a_stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {


    @Test
    void test() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        int num = kthLargest.add(3);
        assertEquals(4, num);
        num = kthLargest.add(5);
        assertEquals(5, num);
    }
}