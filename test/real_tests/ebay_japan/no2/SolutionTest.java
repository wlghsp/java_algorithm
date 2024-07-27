package real_tests.ebay_japan.no2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution solution = new Solution();
        int solution1 = solution.Solution(5, new int[]{9,3, 9,9,9,5,2,7,8,9,8,1,5,8,9,6,1,8,7,9,9,9,8,9,9});
        Assertions.assertThat(solution1).isEqualTo(13);
    }
}