package programmers.level2.n개의최소공배수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{2, 6, 8, 14});
        int result2 = s.solution(new int[]{1, 2, 3});

        assertThat(result1).isEqualTo(168);
        assertThat(result2).isEqualTo(6);
    }
}