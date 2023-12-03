package programmers.level2.방문길이;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("ULURRDLLU");
        int result2 = s.solution("LULLLLLLU");

        assertEquals(7, result1);
        assertEquals(7, result2);
    }
}