package programmers.level1.다트게임;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("1S2D*3T");
        int result2 = s.solution("1D2S#10S");
        int result3 = s.solution("1D2S0T");
        int result4 = s.solution("1S*2T*3S");
        int result5 = s.solution("1D#2S*3S");
        int result6 = s.solution("1T2D3D#");
        int result7 = s.solution("1D2S3T*");

        assertEquals(37, result1);
        assertEquals(9, result2);
        assertEquals(3, result3);
        assertEquals(23, result4);
        assertEquals(5, result5);
        assertEquals(-4, result6);
        assertEquals(59, result7);
    }
}