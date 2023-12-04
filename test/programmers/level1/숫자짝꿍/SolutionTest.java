package programmers.level1.숫자짝꿍;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("100", "2345");
        String result2 = s.solution("100", "203045");
        String result3 = s.solution("100", "123450");
        String result4 = s.solution("12321", "42531");
        String result5 = s.solution("5525", "1255");

        assertEquals("-1", result1);
        assertEquals("0", result2);
        assertEquals("10", result3);
        assertEquals("321", result4);
        assertEquals("552", result5);
    }
}