package programmers.level2.도넛과막대그래프;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}});
        int[] result2 = s.solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});

        assertArrayEquals(new int[]{2, 1, 1, 0}, result1);
        assertArrayEquals(new int[]{4, 0, 1, 2}, result2);
    }
}