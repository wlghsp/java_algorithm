package programmers.level2.가장큰수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(new int[]{6, 10, 2});
        String result2 = s.solution(new int[]{3, 30, 34, 5, 9});

        assertThat(result1).isEqualTo("6210");
        assertThat(result2).isEqualTo("9534330");
    }
}