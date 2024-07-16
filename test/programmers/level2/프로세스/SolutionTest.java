package programmers.level2.프로세스;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{2, 1, 3, 2}, 2);
        int result2 = s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);

        Assertions.assertThat(result1).isEqualTo(1);
        Assertions.assertThat(result2).isEqualTo(5);
    }
}