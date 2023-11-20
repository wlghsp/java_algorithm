package leetcode.leetcode39_Combination_Sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.combinationSum(new int[]{2, 3, 6, 7}, 7);
        List<List<Integer>> result2 = s.combinationSum(new int[]{2, 3, 5}, 8);
        List<List<Integer>> result3 = s.combinationSum(new int[]{2}, 1);

        assertEquals(2, result1.size());
        for (List<Integer> integers : result1) {
            System.out.print(integers + " ");
        }
        System.out.println();
        assertEquals(3, result2.size());
        for (List<Integer> integers : result2) {
            System.out.print(integers + " ");
        }
        System.out.println();
        assertEquals(0, result3.size());
        for (List<Integer> integers : result3) {
            System.out.print(integers + " ");
        }
    }
}