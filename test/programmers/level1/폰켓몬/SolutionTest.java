package programmers.level1.폰켓몬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{3, 1, 2, 3});
        int result2 = s.solution(new int[]{3,3,3,2,2,4});
        int result3 = s.solution(new int[]{3,3,3,2,2,2});

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(2, result3);
    }
}