package leetcode.heap_priorityqueue.leetcode621_task_scheduler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);
        int result2 = s.leastInterval(new char[]{'A', 'C', 'A', 'B', 'D', 'B'}, 1);
        assertEquals(8, result1);
        assertEquals(6, result2);
    }
}