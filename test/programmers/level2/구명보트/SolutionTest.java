package programmers.level2.구명보트;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{70, 50, 80, 50}, 100);
        int result2 = s.solution(new int[]{70, 80, 50}, 100);

        assertEquals(3, result1);
        assertEquals(3, result2);

    }
}