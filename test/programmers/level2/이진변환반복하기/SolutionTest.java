package programmers.level2.이진변환반복하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution("110010101001");
        int[] result2 = s.solution("01110");
        int[] result3 = s.solution("1111111");

        assertArrayEquals(new int[]{3, 8}, result1);
        assertArrayEquals(new int[]{3, 3}, result2);
        assertArrayEquals(new int[]{4, 1}, result3);
    }
}