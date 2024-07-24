package programmers.level2.n2배열자르기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(3, 2, 5);
        int[] result2 = s.solution(4, 7, 14);

        assertThat(result1).isEqualTo(new int[]{3, 2, 2, 3});
        assertThat(result2).isEqualTo(new int[]{4,3,3,3,4,4,4,4});
    }
}