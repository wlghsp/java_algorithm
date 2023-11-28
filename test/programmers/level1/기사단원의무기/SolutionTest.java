package programmers.level1.기사단원의무기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(5, 3, 2);
        int result2 = s.solution(10, 3, 2);

        assertEquals(10, result1);
        assertEquals(21, result2);
    }
}