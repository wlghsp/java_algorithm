package programmers.level2.아날로그시계;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(0, 5, 30, 0, 7, 0);
        int result2 = s.solution(12, 0, 0, 12, 0, 30);
        int result3 = s.solution(0, 6, 1, 0, 6, 6);

        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(1);
        Assertions.assertThat(result3).isEqualTo(0);

    }
}