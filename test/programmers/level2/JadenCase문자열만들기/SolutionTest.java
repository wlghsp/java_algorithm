package programmers.level2.JadenCase문자열만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution("  for the what 1what  ");
        String result2 = s.solution("3people unFollowed me ");
        String result3 = s.solution("a   b");

        assertEquals("  For The What 1what  ", result1);
        assertEquals("3people Unfollowed Me ", result2);
        assertEquals("A   B", result3);
    }
}