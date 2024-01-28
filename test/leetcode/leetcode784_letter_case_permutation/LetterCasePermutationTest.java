package leetcode.leetcode784_letter_case_permutation;

import leetcode.etc.leetcode784_letter_case_permutation.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutationTest {
    @Test
    void testLetterCasePermutationTest() {
        Solution s = new Solution();
        String str = "a1b2";
        List<String> result = s.letterCasePermutation(str);
        Collections.sort(result);
        String[] expected = {"a1b2","a1B2","A1b2","A1B2"};
        Arrays.sort(expected);
        assertArrayEquals(expected, result.toArray(new String[0]));
    }
}