package programmers.level2.소수찾기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("17");
        int result2 = s.solution("011");
        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(2);
    }
}