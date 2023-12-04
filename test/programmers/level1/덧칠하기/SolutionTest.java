package programmers.level1.덧칠하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(8, 4, new int[]{2, 3, 6});
        int result2 = s.solution(5, 4, new int[]{1, 3});
        int result3 = s.solution(4, 1, new int[]{1, 2, 3, 4});

        assertEquals(2, result1);
        assertEquals(1, result2);
        assertEquals(4, result3);
    }
}