package programmers.level2.최솟값만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        int result2 = s.solution(new int[]{1, 2}, new int[]{3, 4});

        assertEquals(29, result1);
        assertEquals(10, result2);
    }
}