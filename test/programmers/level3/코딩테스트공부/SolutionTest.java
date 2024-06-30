package programmers.level3.코딩테스트공부;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(10, 10, new int[][]{{10, 15, 2, 1, 2}, {20, 20, 3, 3, 4}});
        int result2 = s.solution(0, 0, new int[][]{{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}});
        Assertions.assertThat(result1).isEqualTo(15);
        Assertions.assertThat(result2).isEqualTo(13);
    }
}