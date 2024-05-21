package programmers.level0.정수를나선형으로배치하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int[][] result1 = s.solution(4);
        int[][] result2 = s.solution(5);
        assertArrayEquals(new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        }, result1);
        assertArrayEquals(new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        }, result2);
    }
}