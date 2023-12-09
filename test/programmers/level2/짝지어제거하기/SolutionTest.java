package programmers.level2.짝지어제거하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("baabaa");
        int result2 = s.solution("cdcd");
        assertEquals(1, result1);
        assertEquals(0, result2);
    }
}