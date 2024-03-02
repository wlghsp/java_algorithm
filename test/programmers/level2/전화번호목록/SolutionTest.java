package programmers.level2.전화번호목록;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        boolean result1 = s.solution(new String[]{"119", "97674223", "1195524421"});
        boolean result2 = s.solution(new String[]{"123","456","789"});
        boolean result3 = s.solution(new String[]{"12","123","1235","567","88"});

        assertFalse(result1);
        assertTrue(result2);
        assertFalse(result3);
    }
}