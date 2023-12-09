package programmers.level2.카펫;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(10, 2);
        int[] result2 = s.solution(8, 1);
        int[] result3 = s.solution(24, 24);

        assertArrayEquals(new int[]{4, 3}, result1);
        assertArrayEquals(new int[]{3, 3}, result2);
        assertArrayEquals(new int[]{8, 6}, result3);
    }
}