package programmers.level2.숫자의표현;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(15);
        int result2 = s.solution(1);
        assertEquals(4, result1);
        assertEquals(1, result2);
    }
}