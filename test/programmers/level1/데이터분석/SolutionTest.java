package programmers.level1.데이터분석;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();

        int[][] result = s.solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");

        Assertions.assertThat(result).isEqualTo(new int[][]{{3, 20300401, 10, 8}, {1, 20300104, 100, 80}});
    }
}