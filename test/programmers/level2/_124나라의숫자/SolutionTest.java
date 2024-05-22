package programmers.level2._124나라의숫자;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(1);
        String result2 = s.solution(2);
        String result3 = s.solution(3);
        String result4 = s.solution(4);

        assertThat(result1).isEqualTo("1");
        assertThat(result2).isEqualTo("2");
        assertThat(result3).isEqualTo("4");
        assertThat(result4).isEqualTo("11");
    }
}