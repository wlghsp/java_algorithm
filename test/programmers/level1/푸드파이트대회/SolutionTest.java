package programmers.level1.푸드파이트대회;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void 푸드파이트대회test() {
        Solution s = new Solution();
        String result1 = s.solution(new int[]{1, 3, 4, 6});
        String result2 = s.solution(new int[]{1, 7, 1, 2});
        assertEquals("1223330333221", result1);
        assertEquals("111303111", result2);
    }
}