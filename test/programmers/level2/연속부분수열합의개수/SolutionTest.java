package programmers.level2.연속부분수열합의개수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result = s.solution(new int[]{7, 9, 1, 1, 4});
        Assertions.assertThat(result).isEqualTo(18);
    }
}