package programmers.level0.창고정리;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(new String[]{"pencil", "pencil", "pencil", "book"}, new int[]{2, 4, 3, 1});
        String result2 = s.solution(new String[]{"doll", "doll", "doll", "doll"}, new int[]{1, 1, 1, 1});
        String result3 = s.solution(new String[]{"apple", "steel", "leaf", "apple", "leaf"}, new int[]{5, 3, 5, 3, 7});
        String result4 = s.solution(new String[]{"mirror", "net", "mirror", "net", "bottle"}, new int[]{4, 1, 4, 1, 5});

        Assertions.assertThat(result1).isEqualTo("pencil");
        Assertions.assertThat(result2).isEqualTo("doll");
        Assertions.assertThat(result3).isEqualTo("leaf");
        Assertions.assertThat(result4).isEqualTo("mirror");

    }
}