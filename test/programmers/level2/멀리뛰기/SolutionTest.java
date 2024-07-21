package programmers.level2.멀리뛰기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        long result1 = s.solution(4);
        long result2 = s.solution(3);

        Assertions.assertThat(result1).isEqualTo(5);
        Assertions.assertThat(result2).isEqualTo(3);
    }
}