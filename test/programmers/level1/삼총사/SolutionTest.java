package programmers.level1.삼총사;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {


    @Test
    void test삼총사() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{-2, 3, 0, 2, -5});
        int result2 = s.solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
        int result3 = s.solution(new int[]{-1, 1, -1, 1});
        assertEquals(2, result1);
        assertEquals(5, result2);
        assertEquals(0, result3);
    }
}