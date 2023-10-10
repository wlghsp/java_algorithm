package programmers.level1.숫자문자열과영단어;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution("one4seveneight");
        int result2 = s.solution("23four5six7");
        int result3 = s.solution("2three45sixseven");
        int result4 = s.solution("123");
        assertEquals(1478, result1);
        assertEquals(234567, result2);
        assertEquals(234567, result3);
        assertEquals(123, result4);
    }
}