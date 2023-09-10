package programmers.level1.x간격n개수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class X간격n개숫자Test {


    @Test
    void testSolution() {
        Solution s = new Solution();
        long[] result1 = s.solution(2, 5);
        assertArrayEquals(new long[]{2,4,6,8,10}, result1);
    }
}