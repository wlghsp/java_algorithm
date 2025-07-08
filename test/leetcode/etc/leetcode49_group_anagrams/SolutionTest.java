package leetcode.etc.leetcode49_group_anagrams;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionTest {

    @Test
    void testGroupAnagrams() {
        Solution s = new Solution();
        List<List<String>> result = s.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}
        );

        // 변환: List<List<String>> → List<Set<String>>
        List<Set<String>> actual = new ArrayList<>();
        for (List<String> group : result) {
            actual.add(new HashSet<>(group));
        }

        // 기대 결과
        List<Set<String>> expected = List.of(
                Set.of("bat"),
                Set.of("nat", "tan"),
                Set.of("eat", "tea", "ate")
        );

        // 순서 상관 없이 비교
        Assertions.assertThat(actual)
                .containsExactlyInAnyOrderElementsOf(expected);
    }

}