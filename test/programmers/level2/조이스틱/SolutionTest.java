package programmers.level2.조이스틱;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("JEROEN");
        int result2 = s.solution("JAN");

        assertThat(result1).isEqualTo(56);
        assertThat(result2).isEqualTo(23);
    }
}