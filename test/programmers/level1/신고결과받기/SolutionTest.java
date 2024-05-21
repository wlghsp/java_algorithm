package programmers.level1.신고결과받기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(
                new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2
        );
        int[] result2 = s.solution(
                new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3
        );

        Assertions.assertThat(new int[]{2, 1, 1, 0}).isEqualTo(result1);
        Assertions.assertThat(new int[]{0, 0}).isEqualTo(result2);

    }
}