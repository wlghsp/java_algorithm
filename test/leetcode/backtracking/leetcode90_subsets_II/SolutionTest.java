package leetcode.backtracking.leetcode90_subsets_II;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        List<List<Integer>> result1 = s.subsetsWithDup(new int[]{1, 2, 2});
        List<List<Integer>> result2 = s.subsetsWithDup(new int[]{0});

        assertThat(result1).isEqualTo( List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 2),
                List.of(2),
                List.of(2, 2)
        ));

        assertThat(result2).isEqualTo( List.of(
                List.of(),
                List.of(0)
        ));
    }
}