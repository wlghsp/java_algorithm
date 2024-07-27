package programmers.level2.기능개발;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        int[] result2 = s.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});

        assertThat(result1).isEqualTo(new int[]{2, 1});
        assertThat(result2).isEqualTo(new int[]{1, 3, 2});
    }
}