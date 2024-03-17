package programmers.level3.단속카메라;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}});
        assertEquals(2, result1);
    }
}