package programmers.level2.귤고르기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int result2 = s.solution(4  , new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int result3 = s.solution(2  , new int[]{1, 1, 1, 1, 2, 2, 2, 3});

        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(2);
        Assertions.assertThat(result3).isEqualTo(1);
    }
}