package programmers.level1.옹알이2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(new String[]{"aya", "yee", "u", "maa"});
        int result2 = s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        int result3 = s.solution(new String[]{"ayayemaaya"});

        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(1, result3);
    }
}