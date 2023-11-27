package programmers.level1.추억점수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{
                {"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}
        });
        int[] result2 = s.solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{
                {"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}
        });
        int[] result3 = s.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{
                {"may"}, {"kein", "deny", "may"}, {"kon", "coni"}
        });
        assertArrayEquals(new int[]{19, 15, 6}, result1);
        assertArrayEquals(new int[]{67, 0, 55}, result2);
        assertArrayEquals(new int[]{5, 15, 0}, result3);
    }
}