package leetcode.backtracking.leetcode46_permutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.permute(new int[]{1, 2, 3});
        List<List<Integer>> result2 = s.permute(new int[]{0, 1});
        assertEquals(List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        ), result1);
        assertEquals(List.of(
                List.of(0, 1),
                List.of(1, 0)
        ), result2);
    }
}