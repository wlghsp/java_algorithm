package leetcode.leetcode150_evaluate_reverse_polish_notation;

import leetcode.stack.leetcode150_evaluate_reverse_polish_notation.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testEVPN() {
        Solution s = new Solution();
        int result1 = s.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        int result2 = s.evalRPN(new String[]{"4","13","5","/","+"});
        int result3 = s.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
        int result4 = s.evalRPN(new String[]{"3","11","+","5","-"});

        assertEquals(9, result1);
        assertEquals(6, result2);
        assertEquals(22, result3);
        assertEquals(9, result4);
    }
}