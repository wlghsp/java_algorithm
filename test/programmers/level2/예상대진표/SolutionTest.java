package programmers.level2.예상대진표;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(8, 4, 7);
        Assertions.assertThat(result1).isEqualTo(3);
    }
}