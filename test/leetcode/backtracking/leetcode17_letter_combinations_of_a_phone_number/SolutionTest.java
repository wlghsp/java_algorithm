package leetcode.backtracking.leetcode17_letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        List<String> result1 = s.letterCombinations("23");
        List<String> result2 = s.letterCombinations("");
        List<String> result3 = s.letterCombinations("2");

        assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), result1);
        assertEquals(List.of(), result2);
        assertEquals(List.of("a","b","c"), result3);
    }
}