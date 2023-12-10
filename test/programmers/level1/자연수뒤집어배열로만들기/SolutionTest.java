package programmers.level1.자연수뒤집어배열로만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(12345);
        assertArrayEquals(new int[]{5,4,3,2,1}, result1);
    }
}