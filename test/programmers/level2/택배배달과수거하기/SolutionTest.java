package programmers.level2.택배배달과수거하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        long result1 = s.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0});
        long result2 = s.solution(2, 57, new int[]{1, 0, 2, 0, 1, 0, 2}, new int[]{0, 2, 0, 1, 0, 2, 0});

        Assertions.assertThat(result1).isEqualTo(16);
        Assertions.assertThat(result2).isEqualTo(30);
    }
}