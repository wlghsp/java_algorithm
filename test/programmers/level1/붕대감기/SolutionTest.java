package programmers.level1.붕대감기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}});
        int result2 = s.solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}});
        int result3 = s.solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}});
        int result4 = s.solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}});

        Assertions.assertThat(result1).isEqualTo(5);
        Assertions.assertThat(result2).isEqualTo(-1);
        Assertions.assertThat(result3).isEqualTo(-1);
        Assertions.assertThat(result4).isEqualTo(3);
    }
}