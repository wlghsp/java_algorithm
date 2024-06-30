package programmers.level3.풍선터트리기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{9, -1, -5});
        int result2 = s.solution(new int[]{-16,27,65,-2,58,-92,-71,-68,-61,-33});
        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(6);
    }
}