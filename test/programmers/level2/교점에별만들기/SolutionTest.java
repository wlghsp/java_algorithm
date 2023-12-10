package programmers.level2.교점에별만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String[] result1 = s.solution(new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}});
        String[] result2 = s.solution(new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}});
        String[] result3 = s.solution(new int[][]{{1, -1, 0}, {2, -1, 0}});
        String[] result4 = s.solution(new int[][]{{1, -1, 0}, {2, -1, 0}, {4, -1, 0}});

        assertEquals(new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"}, result1);
        assertEquals(new String[]{"*.*"}, result2);
        assertEquals(new String[]{"*"}, result3);
        assertEquals(new String[]{"*"}, result4);

    }
}