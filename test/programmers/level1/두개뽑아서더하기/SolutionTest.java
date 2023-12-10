package programmers.level1.두개뽑아서더하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[]{2, 1, 3, 4, 1});
        int[] result2 = s.solution(new int[]{5,0,2,7});
        assertArrayEquals(new int[]{2,3,4,5,6,7}, result1);
        assertArrayEquals(new int[]{2,5,7,9,12}, result2);
    }
}