package programmers.level1.성격유형검사하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        String result2 = s.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});

        assertEquals("TCMA", result1);
        assertEquals("RCJA", result2);
    }
}