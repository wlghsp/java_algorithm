package leetcode.backtracking.leetcode131_palindrome_partitioning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        List<List<String>> result1 = s.partition("aab"); // [["a","a","b"],["aa","b"]]
        List<List<String>> result2 = s.partition("a");  // [["a"]]

        assertEquals(List.of(
                List.of("a", "a", "b"),
                List.of("aa", "b")
        ), result1);
        assertEquals(List.of(
                List.of("a")
        ), result2);

    }
}