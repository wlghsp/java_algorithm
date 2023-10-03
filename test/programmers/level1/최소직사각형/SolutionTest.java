package programmers.level1.최소직사각형;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test최소직사각형() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        int result2 = s.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}});
        int result3 = s.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});

        assertEquals(4000, result1);
        assertEquals(120, result2);
        assertEquals(133, result3);
    }
}