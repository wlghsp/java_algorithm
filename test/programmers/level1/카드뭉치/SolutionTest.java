package programmers.level1.카드뭉치;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"});

        String result2 = s.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"});

        assertEquals("Yes", result1);
        assertEquals("No", result2);
    }
}