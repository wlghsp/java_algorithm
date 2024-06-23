package programmers.level2.가장큰정사각형찾기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        int result2 = s.solution(new int[][]{{0,0,1,1},{1,1,1,1}});

        Assertions.assertThat(result1).isEqualTo(9);
        Assertions.assertThat(result2).isEqualTo(4);
    }
}