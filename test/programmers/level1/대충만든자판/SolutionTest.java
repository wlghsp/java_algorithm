package programmers.level1.대충만든자판;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        int[] result2 = s.solution(new String[]{"AA"}, new String[]{"B"});
        int[] result3 = s.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"});

        assertEquals(new int[]{9, 4}, result1);
        assertEquals(new int[]{-1}, result2);
        assertEquals(new int[]{4, 6}, result3);
    }
}