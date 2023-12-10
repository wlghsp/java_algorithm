package programmers.level1.모의고사;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = s.solution(new int[]{1, 3, 2, 4, 2});
        assertArrayEquals(new int[]{1}, result1);
        assertArrayEquals(new int[]{1, 2, 3}, result2);

    }
}