package programmers.level2.다리를지나는트럭;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(2, 10, new int[]{7, 4, 5, 6});
        int result2 = s.solution(100, 100, new int[]{10});
        int result3 = s.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});

        assertThat(result1).isEqualTo(8);
        assertThat(result2).isEqualTo(101);
        assertThat(result3).isEqualTo(110);
    }
}