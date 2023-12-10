package programmers.level1.이상한문자만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("try hello world");
        String result2 = s.solution("  abc de  fghi  ");
        assertEquals("TrY HeLlO WoRlD", result1);
        assertEquals("  AbC De  FgHi  ", result2);
    }
}