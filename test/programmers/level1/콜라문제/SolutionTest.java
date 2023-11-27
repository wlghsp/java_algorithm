package programmers.level1.콜라문제;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(2, 1, 20);
        int result2 = s.solution(3, 1, 20);
        
        assertEquals(19, result1);
        assertEquals(9, result2);
    }
}