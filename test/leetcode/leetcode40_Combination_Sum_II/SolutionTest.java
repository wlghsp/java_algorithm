package leetcode.leetcode40_Combination_Sum_II;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        List<List<Integer>> result2 = s.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);

        assertEquals(4, result1.size());
        for (List<Integer> integers : result1) {
            System.out.print(integers + " ");
        }
        System.out.println();
        assertEquals(2, result2.size());
        for (List<Integer> integers : result2) {
            System.out.print(integers + " ");
        }
    }
}