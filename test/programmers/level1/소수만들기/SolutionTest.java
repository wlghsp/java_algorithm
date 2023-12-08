package programmers.level1.소수만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{1, 2, 3, 4});
        int result2 = s.solution(new int[]{1, 2, 7, 6, 4});
        assertEquals(1, result1);
        assertEquals(4, result2);
    }
}