package programmers.level1.신규아이디추천;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("...!@BaT#*..y.abcdefghijklm");
        String result2 = s.solution("z-+.^.");
        String result3 = s.solution("=.=");
        String result4 = s.solution("123_.def");
        String result5 = s.solution("abcdefghijklmn.p");

        assertEquals("bat.y.abcdefghi", result1);
        assertEquals("z--", result2);
        assertEquals("aaa", result3);
        assertEquals("123_.def", result4);
        assertEquals("abcdefghijklmn", result5);
    }
}