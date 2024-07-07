package programmers.level2.하노이의탑;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[][] result = solution.solution(2);
        assertThat(result).isEqualTo(new int[][]{{1, 2}, {1, 3}, {2, 3}});
    }
}