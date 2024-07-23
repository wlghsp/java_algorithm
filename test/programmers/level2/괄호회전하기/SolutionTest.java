package programmers.level2.괄호회전하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("[](){}");
        int result2 = s.solution("}]()[{");
        int result3 = s.solution("[)(]");

        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(2);
        Assertions.assertThat(result3).isEqualTo(0);
    }
}