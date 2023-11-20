package leetcode.leetcode78_subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.subsets(new int[]{1, 2, 3});
        List<List<Integer>> result2 = s.subsets(new int[]{0});

        assertEquals(8, result1.size());
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