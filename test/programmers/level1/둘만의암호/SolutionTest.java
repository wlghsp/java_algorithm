package programmers.level1.둘만의암호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("aukks", "wbqd", 5);
        assertEquals("happy",result1);
    }
}