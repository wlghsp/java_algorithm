package programmers.level3.네트워크;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        int result2 = s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});

        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(1);
    }
}