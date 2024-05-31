package programmers.level2.전력망을둘로나누기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
        int result2 = s.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});
        int result3 = s.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3,4},{4,5},{6,7}});

        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(0);
        Assertions.assertThat(result3).isEqualTo(1);

    }
}