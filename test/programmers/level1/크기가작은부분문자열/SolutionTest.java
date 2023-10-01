package programmers.level1.크기가작은부분문자열;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void testSolution() {
        Solution s = new Solution();
        int result1 = s.solution("3141592", "271"); // 2
        int result2 = s.solution("500220839878", "7"); // 8
        int result3 = s.solution("10203", "15"); // 3

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        assertEquals(2, result1);
        assertEquals(8, result2);
        assertEquals(3, result3);
    }
}