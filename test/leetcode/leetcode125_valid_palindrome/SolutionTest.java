package leetcode.leetcode125_valid_palindrome;

import leetcode.twopointers.leetcode125_valid_palindrome.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.isPalindrome("A man, a plan, a canal: Panama");
        boolean result2 = s.isPalindrome("race a car");
        boolean result3 = s.isPalindrome(" ");
        boolean result4 = s.isPalindrome("0P");
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
        assertEquals(false, result4);
    }
}