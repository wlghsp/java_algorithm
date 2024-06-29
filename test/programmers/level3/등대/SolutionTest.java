package programmers.level3.등대;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(8, new int[][]{{1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}});
        int result2 = s.solution(10, new int[][]{{4, 1}, {5, 1}, {5, 6}, {7, 6}, {1, 2}, {1, 3}, {6, 8}
                , {2, 9}, {9, 10}});

        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(3);

    }
}