package programmers.level2.호텔대실;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}});
        int result2 = s.solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}});
        int result3 = s.solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}});

        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(1);
        Assertions.assertThat(result3).isEqualTo(3);
    }
}