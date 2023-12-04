package programmers.level1.햄버거만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        int result2 = s.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
        assertEquals(2, result1);
        assertEquals(0, result2);

    }
}