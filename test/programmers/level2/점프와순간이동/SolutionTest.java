package programmers.level2.점프와순간이동;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(5);
        int result2 = s.solution(6);
        int result3 = s.solution(5000);

        assertEquals(2, result1);
        assertEquals(2, result2);
        assertEquals(5, result3);
    }
}