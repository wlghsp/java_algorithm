package leetcode.leetcode22_generate_parentheses;

import leetcode.stack.leetcode22_generate_parentheses.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testGenerateParentheses() {
        Solution s1 = new Solution();
        Solution s2 = new Solution();
        List<String> result1 = s1.generateParenthesis(3);
        List<String> result2 = s2.generateParenthesis(1);
        String[] expected1 = {"((()))","(()())","(())()","()(())","()()()"};
        String[] expected2 = {"()"};
        assertArrayEquals(expected1, result1.toArray(new String[0]));
        assertArrayEquals(expected2, result2.toArray(new String[0]));
    }
}