package programmers.level2.두큐합같게만들기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});
        int result2 = s.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2});
        int result3 = s.solution(new int[]{1, 1}, new int[]{1, 5});

        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(7);
        assertThat(result3).isEqualTo(-1);
    }
}