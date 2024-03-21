package leetcode.greedy.leetcode134_gas_station;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        int result2 = s.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3});

        assertEquals(3, result1);
        assertEquals(-1, result2);
    }

}