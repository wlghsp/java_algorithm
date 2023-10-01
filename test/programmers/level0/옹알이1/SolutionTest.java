package programmers.level0.옹알이1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int result2 = s.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        assertEquals(1, result1);
        assertEquals(3, result2);
    }
}