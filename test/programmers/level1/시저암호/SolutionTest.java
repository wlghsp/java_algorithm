package programmers.level1.시저암호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("AB", 1);
        String result2 = s.solution("z", 1);
        String result3 = s.solution("a B z", 4);

        assertEquals("BC", result1);
        assertEquals("a", result2);
        assertEquals("e F d", result3);
    }
}