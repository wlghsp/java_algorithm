package real_tests.ebay_japan.no1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution problem1 = new Solution();
        int result1 = problem1.solution(5, new int[][]{{10, 60}, {15, 30}, {20, 80}, {30, 40}, {35, 70}, {40, 20}});
        int result2 = problem1.solution(5, new int[][]{{7, 35}, {5, 25}, {3, 15}, {1, 5}});

        Assertions.assertThat(result1).isEqualTo(170);
        Assertions.assertThat(result2).isEqualTo(35);
    }
}