package leetcode.leetcode15_3sum;

import leetcode.twopointers.leetcode15_3sum.Solution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test3Sum() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.threeSum(new int[]{-1, 0, 1, 2, -1, -4});


        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        assertEquals(expected, result1);
    }
}