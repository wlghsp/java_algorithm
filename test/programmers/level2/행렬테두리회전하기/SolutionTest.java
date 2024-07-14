package programmers.level2.행렬테두리회전하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});
        int[] result2 = s.solution(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}});
        int[] result3 = s.solution(100, 97, new int[][]{{1, 1, 100, 97}});

        assertThat(result1).isEqualTo(new int[]{8, 10, 25});
        assertThat(result2).isEqualTo(new int[]{1, 1, 5, 3});
        assertThat(result3).isEqualTo(new int[]{1});

    }
}