package programmers.level2.피로도;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result = s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        Assertions.assertThat(result).isEqualTo(3);

    }
}