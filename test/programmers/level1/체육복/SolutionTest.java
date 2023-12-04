package programmers.level1.체육복;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        int result2 = s.solution(5, new int[]{2, 4}, new int[]{3});
        int result3 = s.solution(3, new int[]{3}, new int[]{1});
        int result4 = s.solution(4, new int[]{2, 3}, new int[]{3, 4});
        int result5 = s.solution(5, new int[]{4, 2}, new int[]{3, 5});

        assertEquals(5, result1);
        assertEquals(4, result2);
        assertEquals(2, result3);
        assertEquals(3, result4);
        assertEquals(5, result5);
    }
}