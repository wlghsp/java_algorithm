package programmers.level0.평행;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 평행Test {

    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        int result2 = s.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        int result3 = s.solution(new int[][]{{1, 1}, {2, 2}, {3, 3}, {50, 100}});
        assertEquals(1, result1);
        assertEquals(0, result2);
        assertEquals(0, result3);
    }
}