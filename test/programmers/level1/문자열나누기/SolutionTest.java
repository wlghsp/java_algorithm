package programmers.level1.문자열나누기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
//        int result1 = s.solution("banana");
//        int result2 = s.solution("abracadabra");
//        int result3 = s.solution("aaabbaccccabba");
        int result4 = s.solution("abaabab");

//        assertEquals(3, result1);
//        assertEquals(6, result2);
//        assertEquals(3, result3);
        assertEquals(2, result4);
    }
}