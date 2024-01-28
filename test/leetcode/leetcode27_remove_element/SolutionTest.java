package leetcode.leetcode27_remove_element;

import leetcode.etc.leetcode27_remove_element.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.removeElement(new int[]{3, 2, 2, 3}, 3);
        int result2 = s.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);

        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}