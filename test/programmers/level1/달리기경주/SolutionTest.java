package programmers.level1.달리기경주;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String[] result = s.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}
                , new String[]{"kai", "kai", "mine", "mine"});

        Assertions.assertThat(result).isEqualTo(new String[]{"mumu", "kai", "mine", "soe", "poe"});

    }
}