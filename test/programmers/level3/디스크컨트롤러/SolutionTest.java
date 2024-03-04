package programmers.level3.디스크컨트롤러;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        assertEquals(9, result1);
    }
}