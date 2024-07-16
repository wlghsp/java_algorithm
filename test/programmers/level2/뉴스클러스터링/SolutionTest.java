package programmers.level2.뉴스클러스터링;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution solution = new Solution();
        int result1 = solution.solution("FRANCE", "french");
        int result2 = solution.solution("handshake", "shake hands");
        int result3 = solution.solution("aa1+aa2", "AAAA12");
        int result4 = solution.solution("E=M*C^2", "e=m*c^2");

        assertThat(result1).isEqualTo(16384);
        assertThat(result2).isEqualTo(65536);
        assertThat(result3).isEqualTo(43690);
        assertThat(result4).isEqualTo(65536);
    }
}