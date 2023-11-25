package programmers.level1.실패율;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        int[] result2 = s.solution(4, new int[]{4, 4, 4, 4, 4});

        assertArrayEquals(new int[]{3, 4, 2, 1, 5}, result1);
        assertArrayEquals(new int[]{4, 1, 2, 3}, result2);
    }
}