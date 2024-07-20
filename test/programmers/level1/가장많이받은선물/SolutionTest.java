package programmers.level1.가장많이받은선물;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
        int result2 = s.solution(new String[]{"joy", "brad", "alessandro", "conan", "david"}, new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"});
        int result3 = s.solution(new String[]{"a", "b", "c"}, new String[]{"a b", "b a", "c a", "a c", "a c", "c a"});

        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(4);
        Assertions.assertThat(result3).isEqualTo(0);
    }
}