package programmers.level2.다음큰숫자;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(78);
        int result2 = s.solution(15);
        assertEquals(83, result1);
        assertEquals(23, result2);
    }
}