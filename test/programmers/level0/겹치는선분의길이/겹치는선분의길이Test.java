package programmers.level0.겹치는선분의길이;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 겹치는선분의길이Test {


    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        int result2 = s.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});
        int result3 = s.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});
        assertEquals(2, result1);
        assertEquals(0, result2);
        assertEquals(8, result3);
    }
}