package programmers.level1.과일장수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        int result2 = s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});

        assertEquals(8, result1);
        assertEquals(33, result2);
    }
}