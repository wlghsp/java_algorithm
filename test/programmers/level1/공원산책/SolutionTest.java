package programmers.level1.공원산책;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        int[] result2 = s.solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"});
        int[] result3 = s.solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});

        assertThat(result1).isEqualTo(new int[]{2, 1});
        assertThat(result2).isEqualTo(new int[]{0, 1});
        assertThat(result3).isEqualTo(new int[]{0, 0});
    }
}