package programmers.level2.H_Index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int solution = s.solution(new int[]{3, 0, 6, 1, 5});
        assertThat(solution).isEqualTo(3);
    }
}