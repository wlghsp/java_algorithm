package leetcode._1d_dp.leetcode139_word_break;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.wordBreak("leetcode", List.of("leet", "code"));
        boolean result2 = s.wordBreak("applepenapple", List.of("apple","pen"));
        boolean result3 = s.wordBreak("catsandog", List.of("cats","dog","sand","and","cat"));

        Assertions.assertThat(result1).isEqualTo(true);
        Assertions.assertThat(result2).isEqualTo(true);
        Assertions.assertThat(result3).isEqualTo(false);
    }
}