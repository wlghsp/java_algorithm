package leetcode.leetcode238_product_of_array_except_self;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void productOfArrayExceptSelf() {
        Solution s = new Solution();
        int[] result1 = s.productExceptSelf(new int[]{1, 2, 3, 4});
        int[] result2 = s.productExceptSelf(new int[]{-1,1,0,-3,3});

        assertArrayEquals(new int[]{24, 12, 8, 6}, result1);
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, result2);
    }
}