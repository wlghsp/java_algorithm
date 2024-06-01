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
        int result4 = s.solution(11, 59, 30, 12, 0, 0);
        int result5 = s.solution(11, 58, 59, 11, 59, 0);
        int result6 = s.solution(1, 5, 5, 1, 5, 6);
        int result7 = s.solution(0, 0, 0, 23, 59, 59);

        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(1);
        Assertions.assertThat(result3).isEqualTo(0);
        Assertions.assertThat(result4).isEqualTo(1);
        Assertions.assertThat(result5).isEqualTo(1);
        Assertions.assertThat(result6).isEqualTo(2);
        Assertions.assertThat(result7).isEqualTo(2852);

    }
}