package programmers.level2.최댓값과최솟값;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("1 2 3 4");
        String result2 = s.solution("-1 -2 -3 -4");
        String result3 = s.solution("-1 -1");

        assertEquals("1 4", result1);
        assertEquals("-4 -1", result2);
        assertEquals("-1 -1", result3);
    }
}